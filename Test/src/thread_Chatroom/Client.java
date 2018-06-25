package thread_Chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public String clientId; //id ����ʵ� ����
	
	
	public static void main(String[] args) {
		
		Socket sock=null;
		
		try {
			sock=new Socket("localhost",20000);
			new Client().new Receiver(sock).start();
			new Client().new Sender(sock).start();
			
		} catch (IOException e) {
			System.out.println("[ERROR]���� ���� ����");
		}
		
				
				
		
		
		
		
	}
	
	// ���ù� ������ 
	public class Receiver extends Thread{
		
		Socket sock;// ���� ����ʵ�
		
		//������(�Ű����� ����)
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		
		
		//������
		@Override
		public void run() {
			BufferedReader in = null; //���� �Է� ��Ʈ�� �ʱ�ȭ
			try {
				//�Է� ��Ʈ�� ����(���� ����)
	
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String msg; //�Է� �޽��� ���� ����
				while(true){
					try {
					if(clientId.equals("����")) break;
					}catch(Exception e) {}
					msg=in.readLine(); //�������� ���� �޽��� ���۹ޱ�
					System.out.println(msg); //���۹��� ���� ����� ���
				}
			} catch (IOException e1) {
				System.out.println("[ERROR]�Է� ��Ʈ�� ���� ����");

			}finally {
					try {
						if(in!=null) in.close();
						if(sock!=null) sock.close();
					} catch (IOException e) {
						System.out.println("[ERROR] �Է� �ڿ� ȸ�� ����");
					}
				
				
			}
			
			
		}
		
		
		
	}
	//���� ������
	public class Sender extends Thread{
		
		Socket sock = null; //���� ����ʵ�
		
		//������(�Ű����� ����)
		public Sender(Socket sock) {
			
			this.sock = sock;
			
		}
		
		//������
		@Override
		public void run() {
			BufferedReader reader =null;  //���� �Է� ��Ʈ�� �ʱ�ȭ
			PrintWriter writer = null; //��� ��Ʈ�� �ʱ�ȭ
			
			try {
				System.out.println(sock.isConnected()+ " : " + sock.getLocalPort());
				//�Է� ��Ʈ�� Ű���� ����
				reader = new BufferedReader(new InputStreamReader(System.in));
				String msg; //�Է¹��� �޽��� ����
				//��� ��Ʈ�� ����
				writer = new PrintWriter(sock.getOutputStream(),true);
				
				//id �Է¹ޱ�//
				System.out.print("ID�� �Է��ϼ��� >> ");
				msg = reader.readLine();
				clientId=msg;
				writer.println("CLIENT_ID_IS_"+msg);
				writer.flush();
				
				while(true) {
				    msg = reader.readLine();
					writer.println(msg);
					writer.flush();	
					if(msg.equals("����")) break;
				}
				clientId = "����";
			} catch (IOException e) {
				System.out.println(" [Ŭ���̾�Ʈ ����]����� ������ϴ�!!");
			}finally {
				try {				
				    if(writer!=null) writer.close();
					if(reader!=null) reader.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
			System.out.println("+ + + [Ŭ���̾�Ʈ ����] ��� ���� ���� + + +");
		}
		
	}
		

	
	


}
