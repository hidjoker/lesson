package thread_Chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;


public class Server {

	Map<String , PrintWriter> idMap = new HashMap<>();

	//클라이언트 매니저 스레드
	public class ClientManager extends Thread{
				
		private String id;
		Socket sock=null;
				
		public ClientManager(Socket sock) {
			this.sock = sock;
		}
				
		@Override
		public void run() {
			BufferedReader in = null;
			
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			} catch (IOException e1) {
				System.out.println("[ERROR]입력 스트림 생성 실패");
			}
			String msg;
			String[] msgArr;
					
			while(true){
				try {
					msg = in.readLine();
					if(msg==null) { 
						for(String id : idMap.keySet()) {
							idMap.get(id).println(this.id+"님이 로그아웃 하셨습니다");
						}
						idMap.get(id).close();
						idMap.remove(id);						
					}else if(msg.contains("_ID_IS_")) {
						msgArr = msg.split("_ID_IS_");
						this.id=msgArr[1];
						idMap.put(msgArr[1], new PrintWriter(sock.getOutputStream()));
						for(String id : idMap.keySet()) {
						idMap.get(id).println(this.id +"님이 로그인 되었습니다");
						}
					}else {
						for(String id : idMap.keySet()) {
							idMap.get(id).println("받은 메시지>>" + msg);
						}
					}
				} catch (IOException e) {
					System.out.println(" 통신이 끊겼습니다!! ");
				}finally {
					try {
						if(in!=null) in.close();
						System.out.println(" + + + 통신 종료 + + + ");		
					} catch (IOException e) {
						System.out.println("[ERROR] 자원 클로즈 에러");
					}

			    }
			
		      }
						
         }
    }
	
		
	

	public static void main(String[] args) {

		ServerSocket serv=null; // 서버 소켓 생성
		Socket sock = null; // 통신 소켓 생성
		try {
			serv = new ServerSocket(20000);

			while(true) {
				System.out.println("Listening.....");
				sock = serv.accept();
				new Server().new ClientManager(sock).start();
			}
			
		} catch (IOException e) {
			System.out.println("서버 접속 실패!!");
		}
		
		
	}
	

	
}
