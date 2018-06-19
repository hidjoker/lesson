package network_Socket;

//+ 소켓, Socket
//- TCP/IP를 이용하는 통신용 API
//- SW적인 가상 장치(통신 접속지점)
//- 자바에서는 클래스로 구현되어있음
//- 소켓 스트림
//    -> 내부에 입출력 스트림을 포함하고 있음
//+ 소켓 통신
//- 소켓을 이용한 통신
//- 소켓 프로그래밍
//- 클라이언트 소켓 : Socket class, DatagramPacket class
//- 서버 소켓 : ServerSocket class, DatagramSocket class
//- CS 간의 소켓을 이용한 통신
//+ TCP 프로그래밍
//+ 네트워크 프로그래밍


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓
		Socket sock = null; // 서버 통신 소켓
		
		BufferedReader in = null; // 입력 스트림
		
		try {
			servSock = new ServerSocket(9988); //9988 port로 소켓 생성
			System.out.println("+ + + 서버 소켓 생성 + + +");
			
			System.out.println("Listening....!!");
			sock = servSock.accept();
			System.out.println("Client Accepted!!");
			
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
					
			String receive = in.readLine();
			System.out.println("\n\t>>전송데이터 : "+receive);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
