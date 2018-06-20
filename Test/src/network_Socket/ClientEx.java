package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {
	
	public static void main(String[] args) {
		
		Socket sock = null;
		PrintWriter out = null;
		
		try {
			System.out.println(" + + + 클라이언트 실행 + + +");
			// 접속 요청
			sock = new Socket("localhost",9988); //localhost 자기 자신을 가리킴 = 127.0.0.1
			
			// 출력 스트림 개설
			out = new PrintWriter(
			sock.getOutputStream() );
			
			// 데이터 출력 - 서버로 데이터 전송
			out.println("Hello");
			
			// 전송(출력) 완료
			out.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
