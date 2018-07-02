import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private static final String HOST = "localhost";
	private static final int PORT = 20000;
	
	private String id = null;
	
	public Client() {
		try {
			Socket sock = new Socket(HOST,PORT);
			initSockConn(sock);			
		} catch (UnknownHostException e) {
			System.out.println("�� �� ���� HOST ����");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
		
	}
	
	
	private void initSockConn(Socket sock) {
		new Receiver(sock).start();
		new Sender(sock).start();
		
		
	}

	class Receiver extends Thread{
		
		private Socket sock;
		
		public Receiver(Socket sock) {
            
			this.sock = sock;
            
		}
		
		@Override
		public void run() {
			
			BufferedReader in = null;
			
			try {
				
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				String msg;
				while((msg=in.readLine())!=null) {					
					System.out.println(msg);

				}
				
				
			} catch (IOException e) {
				System.out.println("��ǲ ��Ʈ�� ���� ����");
			}finally {
					try {
						if(in!=null)in.close();
						System.out.println("����� �����մϴ�");
					} catch (IOException e) {
						System.out.println("��ǲ �ڿ� ȸ�� ����");
					}
			}
			
		
		}
		
		
		
	}

	class Sender extends Thread{
		
		private Socket sock;
		
		public Sender(Socket sock) {
		
			this.sock = sock;
		}
		
		@Override
		public void run() {
			BufferedReader in = null; 
			PrintWriter out = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(System.in));
				out = new PrintWriter(sock.getOutputStream());
				System.out.println("ID�� �Է��ϼ���>>");
				String msg = in.readLine();
				id = msg;
				out.println("Client_ID_IS_"+id);
				out.flush();
				System.out.println(id+"�� ȯ���մϴ�");
				while(true) {
					msg = in.readLine();
					if(msg.equals("/EXIT"))break;
					out.println(msg);
					out.flush();
				}
								
			} catch (IOException e) {
				System.out.println("���� ��Ʈ�� ���� ����");
			}finally {
					try {
						if(in!=null)in.close();
						if(out!=null) out.close();
						if(sock!=null)sock.close();
					} catch (IOException e) {
						System.out.println("���� �ڿ� ȸ�� ����");
					}
			}
			
		
		}
		
	}



	public static void main(String[] args) {
		Client c = new Client();
				
		
	}
	
	

}
