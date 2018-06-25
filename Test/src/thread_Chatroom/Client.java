package thread_Chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	
	public String clientId; //id 멤버필드 선언
	
	
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
	
	// 리시버 스레드 
	public class Receiver extends Thread{
		
		Socket sock;// 소켓 멤버필드
		
		//생성자(매개변수 소켓)
		public Receiver(Socket sock) {
			this.sock = sock;
		}
		
		
		
		//스레드
		@Override
		public void run() {
			BufferedReader in = null; //보조 입력 스트림 초기화
			try {
				//입력 스트림 생성(소켓 연결)
	
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				
				String msg; //입력 메시지 저장 변수
				while(true){
					try {
					if(clientId.equals("종료")) break;
					}catch(Exception e) {}
					msg=in.readLine(); //소켓으로 부터 메시지 전송받기
					System.out.println(msg); //전송받은 내용 모니터 출력
				}
			} catch (IOException e1) {
				System.out.println("[ERROR]입력 스트림 생성 실패");

			}finally {
					try {
						if(in!=null) in.close();
						if(sock!=null) sock.close();
					} catch (IOException e) {
						System.out.println("[ERROR] 입력 자원 회수 실패");
					}
				
				
			}
			
			
		}
		
		
		
	}
	//센더 스레드
	public class Sender extends Thread{
		
		Socket sock = null; //소켓 멤버필드
		
		//생성자(매개변수 소켓)
		public Sender(Socket sock) {
			
			this.sock = sock;
			
		}
		
		//스레드
		@Override
		public void run() {
			BufferedReader reader =null;  //보조 입력 스트림 초기화
			PrintWriter writer = null; //출력 스트림 초기화
			
			try {
				System.out.println(sock.isConnected()+ " : " + sock.getLocalPort());
				//입력 스트림 키보드 연결
				reader = new BufferedReader(new InputStreamReader(System.in));
				String msg; //입력받은 메시지 저장
				//출력 스트림 생성
				writer = new PrintWriter(sock.getOutputStream(),true);
				
				//id 입력받기//
				System.out.print("ID를 입력하세요 >> ");
				msg = reader.readLine();
				clientId=msg;
				writer.println("CLIENT_ID_IS_"+msg);
				writer.flush();
				
				while(true) {
				    msg = reader.readLine();
					writer.println(msg);
					writer.flush();	
					if(msg.equals("종료")) break;
				}
				clientId = "종료";
			} catch (IOException e) {
				System.out.println(" [클라이언트 센더]통신이 끊겼습니다!!");
			}finally {
				try {				
				    if(writer!=null) writer.close();
					if(reader!=null) reader.close();
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			
			
			
			System.out.println("+ + + [클라이언트 센더] 통신 접속 종료 + + +");
		}
		
	}
		

	
	


}
