package thread_Chat1on1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1on1 {

	//PORT
	private final int PORT = 10005;
	public Server_1on1() {
		ServerSocket serv = null; // ��������
		try {
			serv = new ServerSocket(PORT);
			System.out.println("--- Ŭ���̾�Ʈ ����� ---");
			Socket sock = serv.accept();
			
			System.out.println(
					"Ŭ���̾�Ʈ("+sock.getInetAddress().getHostAddress()+") ����");
			
			//----- ������ ��� -----
			// ���� -> Ŭ���̾�Ʈ ���
			// Ŭ���̾�Ʈ -> ���� ���
			chat(sock);
			//--------------------
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void chat(Socket sock) {
		// Sender Thread
		new Sender_1on1(sock).start();
		// keyboard input -> sock output
		
		
		// Receiver Thread
		new Receiver_1on1(sock).start();
		// sock input -> monitor output
	}
	
	public static void main(String[] args) {
		new Server_1on1();
	}
}
