import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {

	private static final int PORT = 20000;
	private HashMap<String, PrintWriter> map= new HashMap<>();
	
	
	public void serverEx() {
		ServerSocket serv;
		Socket sock=null;
		try {
			serv = new ServerSocket(PORT);
			
			while(true) {
			   System.out.println("Listening");
			   sock = serv.accept();
			   new ClientManager(sock).start();
			}
		} catch (IOException e1) {
			System.out.println("소켓 생성/연결 오류");
		}

	}
		
	
	
	class ClientManager extends Thread{
		
		private Socket sock;
		private String clientID; 
		
		public ClientManager(Socket socket) {
			this.sock = socket;
		}
		
		@Override
		public void run() {
			BufferedReader in=null;
			PrintWriter out=null;
			System.out.println("진입했어요");
			try {
				in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
				out = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
				String msg;
				
				while((msg=in.readLine())!=null) {
					if(msg.contains("_ID_IS_")) {
						String[] arr = msg.split("_ID_IS_");
						clientID = arr[1];
						map.put(clientID, out);
						System.out.println(clientID+"님 ID등록");
						for(String id : map.keySet()) {
							if(id.equals(clientID)) continue;
							map.get(id).println(clientID+"님이 로그인 했습니다");
							map.get(id).flush();
						}	
					}else {
						for(String id : map.keySet()) {
						if(id.equals(clientID)) continue;
						map.get(id).println(clientID+">>"+msg);
						map.get(id).flush();
				        }
				
					}
					System.out.println(msg);
				}
				System.out.println(clientID+"님 접속 종료");
				for(String id : map.keySet()) {
					if(id.equals(clientID)) continue;
					map.get(id).println(clientID+"님이 로그아웃 했습니다");
					map.get(id).flush();
				}
				map.remove(clientID);
			} catch (IOException e) {
				System.out.println("스트림 생성에 실패했습니다");
			}finally {
				try {
					if(in!=null) in.close();
					if(out!=null) out.close();
					if(sock!=null) sock.close();
					System.out.println(sock.getPort()+"의 통신 접속을 정상 종료합니다");
				} catch (IOException e) {
					System.out.println("스트림 자원 회수에 실패했습니다");
				}

				
			}

		}
	}
	
	public static void main(String[] args) {
		Server s = new Server();
		s.serverEx();
		
	}
	

}