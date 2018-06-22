package thread_Chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public String clientId;
	
	public class Receiver extends Thread{
		
		Socket sock = null;
		
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		@Override
		public void run() {
			BufferedReader in = null;
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				while(true){
					String msg;
					msg=in.readLine();
					System.out.println(msg);
					
				}
			} catch (IOException e1) {
				System.out.println("[ERROR]입력 스트림 생성 실패");

			}finally {
					try {
						if(in!=null) in.close();
					} catch (IOException e) {
						System.out.println("[ERROR] 입력 자원 생성 실패");
					}
				
				
			}
			
			
		}
		
		
		
	}
	
	public class Sender extends Thread{
		
		Socket sock = null;
		
		public Sender(Socket sock) {
			
			this.sock = sock;
			
		}
		
		@Override
		public void run() {
			BufferedReader reader =null;
			PrintWriter writer = null;
			
			try {
				reader = new BufferedReader(new InputStreamReader(System.in));
				String msg;
				writer = new PrintWriter(sock.getOutputStream(),true);
				System.out.print("ID를 입력하세요 >> ");
				msg = reader.readLine();
				writer.println("CLIENT_ID_IS_"+msg);
				
				while(true) {
					System.out.print("보낼 메시지>>");
				    msg = reader.readLine();
					if(msg=="/EXIT") break;
					writer.println(msg);
					
					
				}
				
			} catch (IOException e) {
				System.out.println("통신이 끊겼습니다!!");
			}
			
			
			
		}}
		

	
	
	public static void main(String[] args) {
		
		Socket sock=null;
		
		try {
			sock=new Socket("localhost",20000);
			new Client().new Receiver(sock).start();
			new Client().new Sender(sock).start();
			
		} catch (IOException e) {
			System.out.println("[ERROR]소켓 연결 실패");
		}
		
				
				
		
		
		
		
	}

}
