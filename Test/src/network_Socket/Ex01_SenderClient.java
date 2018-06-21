package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex01_SenderClient {


	public static void main(String[] args) {
		
		Socket sock = null; //클라이언트 소켓 객체
		PrintWriter out = null; //소켓 출력 스트림 객체
		
		Scanner sc = new Scanner(System.in); //키보드 입력
		
		try {
			System.out.println(" + + + 클라이언트 실행 + + +");
			// 접속 요청
			sock = new Socket("localhost",20000); //localhost 자기 자신을 가리킴 = 127.0.0.1
			
			// 출력 스트림 개설, autoFlush = true
			out = new PrintWriter(
			sock.getOutputStream(), true ); //자동 flush boolean값 print계열만 가능 
			
			//--------데이터 통신 -------------
			
			StringBuffer msg = new StringBuffer();
			while(true){
				// 전송할 내용 입력
				System.out.println("\t보낼 메시지 : ");
				msg.append(sc.nextLine());
				
				if("EXIT".equals(new String(msg))) break;
			
				// 서버로 전송
				out.println(msg);
				msg.delete(0, msg.length());
			}
			
			//-------------------------------
			System.out.println(" + + + 통신 완료 + + + ");

			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	
			if(out!=null) out.close(); 
			//PrintWriter.close는 예외처리를 안해도 됨, flush관련 문제가 발생하지 않는다
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
	
   }
}