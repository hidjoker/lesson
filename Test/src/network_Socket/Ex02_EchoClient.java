package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_EchoClient {

	public static void main(String[] args) {
		
		Socket sock = null; //클라이언트 소켓 객체
		
		PrintWriter out = null; //소켓 출력 스트림 객체
		BufferedReader in = null; // 입력 스트림
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
	
		try {
			System.out.println(" + + + 클라이언트 실행 + + +");
			// 접속 요청
			sock = new Socket("localhost",20000); //localhost 자기 자신을 가리킴 = 127.0.0.1
			
			
			// 출력 스트림 개설, autoFlush = true
			out = new PrintWriter(
			sock.getOutputStream(), true ); //자동 flush boolean값 print계열만 가능 
			
	        // 입력 스트림 개설
			
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
			
			//--------데이터 통신 -------------
			
			String msg = null; // 메시지
			while(true){
				// 전송할 내용 입력
				System.out.println("\t보낼 메시지 : ");
				msg = sc.nextLine();
				
				if("/EXIT".equals(msg)) break;
			
				// 서버로 전송
				out.println(msg);
				
				msg= in.readLine();
				System.out.println("받은메시지 : " + msg);
				
			}
			
			//-------------------------------
			System.out.println(" + + + 통신 완료 + + + ");

		} catch (UnknownHostException e) {	
			System.out.println("[ERROR] 알 수 없는 호스트 입니다");
		} catch (IOException e) {
			System.out.println("[ERROR] 소켓 생성 실패, 서버와 연결할 수 없습니다");
		}finally {	
			if(out!=null) out.close(); 
			//PrintWriter.close는 예외처리를 안해도 됨, flush관련 문제가 발생하지 않는다
			try {
				if(in!=null) in.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}	
}
