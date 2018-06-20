package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_ReceiveServer {

	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 서버 통신 소켓
		
		BufferedReader in = null; // 입력 스트림
		
		try {
			servSock = new ServerSocket(20000); //20000 port로 소켓 생성
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			System.out.println("Listen Port : "
					+ servSock.getLocalPort() );
			System.out.println("----------------------");
            sock = servSock.accept(); //Listen
			
            // -----BLOCK ----- //
			
			System.out.println("클라이언트 접속!!");
			// 클라이언트 ip정보 얻기
			InetAddress ip = sock.getInetAddress();
			System.out.println("\t>>클라이언트 IP : "
					+ip.getHostAddress()); // IP
			System.out.println("\t>>통신소켓 Port : "
					+sock.getPort()); //Port
			
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
			
			// ----- 데이터 통신 ------
			
			String msg = null;
			while((msg = in.readLine())!=null) {
				System.out.println("받은메시지>> " + msg);
			}
			
			System.out.println(" + + + 클라이언트 연결 끊김 + + + ");
			// ---------------------
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null) in.close();
				if(sock!=null) sock.close();
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println(" + + + 클라이언트 연결 끊김 + + +");
			}finally {
				try {
					if(in!=null) in.close();
					if(sock!=null) sock.close();
					if(servSock!=null) servSock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		    }

		}
	}
}
