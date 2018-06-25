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

	static Map<String , PrintWriter> idMap = new HashMap<>(); //id와 출력스트림 관리 맵

	//메인 메소드
	public static void main(String[] args) {

		ServerSocket serv=null; // 서버 소켓 생성
		Socket sock = null; // 통신 소켓 생성
		try {
			serv = new ServerSocket(20000);

			while(true) {
				System.out.println("Listening.....");
				sock = serv.accept();
				System.out.println(sock.getInetAddress().getHostAddress()+"에서 서버에 접속했습니다.");
				new ClientManager(sock).start();
			}
			
		} catch (IOException e) {
			System.out.println("[서버] 서버 접속 실패!!");
		}
		
		
	}
	
	//클라이언트 매니저 innerclass 스레드
	public static class ClientManager extends Thread{
				
		private String id; // id 멤버필드
		Socket sock=null; // sock 선언
				
		//생성자(소켓 변수)
		public ClientManager(Socket sock) { 
			this.sock = sock;
		}
				
		//스레드
		@Override
		public void run() {
			
			BufferedReader in = null; // 입력 스트림 초기화
			
			try {
				// 입력 스트림 생성
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			} catch (IOException e1) {
				System.out.println("[ERROR]입력 스트림 생성 실패");
			}
			String msg; // 전송받은 문자열 임시 저장소
			String[] msgArr; // ID식별하기 위한 보조 문자열 배열
					
				try {
					while(true){
					msg = in.readLine(); //서버로 부터 문자열 전송받기
					if(msg.equals("종료")) {  //전송받은 문자열이 없을 경우
						for(String id : idMap.keySet()) {
							if(this.id==id)continue;
							idMap.get(id).println(this.id+"님이 로그아웃 하셨습니다");
							idMap.get(id).flush();
						}
						idMap.get(id).close(); // 해당 id 출력스트림 자원 회수
						this.sock.close(); //해당 id 연결 끊기
						idMap.remove(id); // 해당 id 데이터 삭제						
					}else if(msg.contains("_ID_IS_")) { //전송받은 문자열에 ID식별자를 포함할 경우
						msgArr = msg.split("_ID_IS_");
						this.id=msgArr[1];
						System.out.println("id확인 :"+this.id);
						idMap.put(this.id, new PrintWriter(sock.getOutputStream()));
						for(String id : idMap.keySet()) {
							System.out.println("사이즈 : "+idMap.keySet().size());
							if(this.id==id) continue;
						idMap.get(id).println(this.id +"님이 로그인 되었습니다");
						idMap.get(id).flush();
						}
					}else { //전송받은 문자열 읽어 그대로 클라이언트 전송(출력)
						for(String id : idMap.keySet()) {
							if(this.id==id) continue;
							idMap.get(id).println(this.id+">>" + msg);
							idMap.get(id).flush();
						}
					}
					}
				} catch (IOException e) {
					System.out.println("[서버-클라이언트 매니저]통신이 끊겼습니다!! ");
				}finally {
					try {
						if(in!=null) in.close();
						System.out.println(" + + + 통신 종료 + + + ");		
					} catch (IOException e) {
						System.out
						.println("[ERROR] 자원 회수 에러");
			    }

			  }
			
		   }
						
     }
    
	
		
	

	
	

	
}
