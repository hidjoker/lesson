package network;

import java.net.MalformedURLException;
import java.net.URL;

public class Net02_URL {

//	 + URL class
//	  - URL 정보를 관리하는 클래스
//	  - URL, Uniform Resource Locater
//	  - 인터넷 상의 정보(자원)이 어디있는지 표현하는 방법(위치)
//	  - URL의 형식
//	    프로토콜 ://인터넷주소[:포트주소][/디렉토리[/파일이름]][?쿼리스트링]
//
//	 ** 쿼리스트링
//	   URL 자원에 대한 매개변수
//	   ? 변수1 = 값1 & 변수2 = 값2 & 변수3 = 값3...

	
	public static void main(String[] args) {
		
		String urlStr
		= "https://www.oracle.com:443/downloads/index.html";
		
		URL url = null;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		System.out.println(
				"프로토콜 : "+url.getProtocol());
		System.out.println(
				"호스트 : " + url.getHost());
		System.out.println(
				"포트번호 : "+url.getPort());
		System.out.println(
				"파일경로 : "+url.getFile());
		System.out.println(
				"전체 : "+url.toExternalForm());
		
	
	}
	
}
