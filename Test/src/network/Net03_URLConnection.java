package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	
//	 + URLConnection class
//	  - 어플리케이션(프로그램)과 URL 사이의 통신 연결하는 클래스
//	  - URL의 내용을 읽거나 URL로 데이터를 전달할 떄 사용하는 클래스
//	  - 추상클래스
//	     객체생성 불가
//	     URL객체에서 openConnection() 메소드로 객체를 얻어서 사용
//	  - 사용절차
//	    1. URL 객체 생성
//	    2. openConnection() -> URLConnection 객체 얻어오기
//	    3. getInputStream() -> InputStream 얻기
//	    4. InputStreamReader 생성 -> Reader로 변환
//	    5. BufferedReader 생성 -> BufferedReader로 변환
//	    6. 읽기( read() )
//	    7. 읽은 내용 처리(모니터출력, 파일출력, ...)


	public static void main(String[] args) {
		
		String urlStr
		= "https://www.oracle.com:443/downloads/index.html";
		
		URL url = null; // URL 정보 객체
		URLConnection conn = null; // URL 접속 객체
		
		BufferedReader reader = null; // 입력스트림
		
		char[] cbuf = new char[1024]; // 입력스트림 보조 버퍼
		int len = -1; // 입력스트림 입력 길이
		
		try {
			url = new URL(urlStr); // 연결한 URL 생성
			conn = url.openConnection(); // 연결 수립
			
			// 연결 객체로부터 스트림 얻기
			reader = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream() ));
			
			while((len = reader.read(cbuf))!= -1) {
				System.out.println(
						new String(cbuf,0,len));
			}
			
			// conn -> InputStream
			// InputStream -> Reader
			// Reader -> BufferedReader
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
	}
	
}
