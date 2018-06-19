package network;


//+ 네트워크, Network
// - 노드(node)들의 연결망
// - 노드 : Network에 연결된 시스템
//   (컴퓨터, 주변장치, 네트워크장비 등등)
// - 서버(Server) : 다른 노드에게 하나 이상의 서비스를 제공하는 노드
// - 클라이언트(Client) : 서비스를 제공받는(이용하는) 노드
// - 서비스, Serivice
//   클라이언트에게 제공되는 기능
//   클라이언트의 편의를 위한 기능
//
//+ 프로토콜, Protocol
// - 통신규약
// - TCP/IP protocol 
// - 통신방식, 전송 데이터 형식, 원격지 주소 표현법 등을 정의함
// 
// ex) 노드1                              노드2
//     통신시작 ----------------------->
//                <---------------------- O.K
//      30KB전송예정------------------>
//                <---------------------- O.K
//      데이터전송--------------------->
//                                           받아서 파일 저장
//
// + TCP/IP, Transmission Control Protocol / Internet Protocol
//  - TCP : 연결 제어 프로토콜
//  - IP : 노드 위치 프로토콜
//
//  - 패킷, Packet (1500B)
//     네트워크 상으로 전달될 데이터를 작은 조각으로 나눈 단위
//
//  - TCP : 패킷들을 나누거나 조립하는 역할을 담당
//  - UDP : 데이터그램을 나누거나 조립하는 역할을 담당
//   (데이터그램 == 패킷)
//   (User Datagram Protocol)
//  - IP : 패킷(데이터그램)을 전달하거나 받는 역할을 담당
//
// + TCP vs UDP
//   - TCP : 연결지향적, 신뢰성있는 통신, 안정성
//   - UDP : 비연결지향적, 비신뢰성 통신, 속도, 스트리밍
//** 연결지향적 : 노드간 연결이 확실할 떄만 통신
//** 신뢰성 : 데이터의 손실여부를 체크
//
// + TCP/IP Protocol 에서 사용되는 주소
//   - IP Address : 노드의 위치를 나타내는 주소
//         IP Protocol 에서 정해진 형태를 따른다
//         32bit unsigned int
//         4자리로 나눠서 표현한다
//         0~255 . 0~255 . 0~255 . 0~255
//         
//   - Port Number(Address) : 서비스의 종류, 형태
//      (논리적인 접속 장소(=서비스 위치))
//        TCP Protocol 에서 형태를 정한다
//        16bit unsigned int
//        0~65535
//        200.200.200.1 : 8088
//           < Ip >     : <Port>
//        1~1023  잘 알려진 포트, Well - Known Prot
//        21 : FTP(파일 전송 프로토콜)
//        25 : SMTP(메일 전송 프로토콜)
//        80 : WEB Service, HTTP
//        443 : 보안 WEB Service, HTTPS, HTTP over SSL



import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	
//	=== 자바의 네트워크 관련 클래스 ===
//
//			 + InetAddress Class
//			  - IP 정보 관리
//			  - 생성자 없음
//			  - 정적메소드를 이용하여 정보 얻어와야함
//			     ex) getByName(), getLocalHost()
//
//			 ** localhost ( == 127.0.0.1 )
//			    자기자신을 나타내는 호스트네임(IP)
//			    자기자신의 IP를 적은 것과 같은 효과를 낸다

	

	public static void main(String[] args) {
		
		// InetAddress - IP정보를 다루는 클래스
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println(
				"HostName : "+ip.getHostName()); //노드 이름, 도메인
		System.out.println(
				"HostAddress : "+ip.getHostAddress()); //도메인이 가지고 있는 ip주소
		System.out.println(
				"toString() : "+ip);
		
		System.out.println("-----------------------");
		byte[] ipAddr = ip.getAddress();
		System.out.println(
				"getAddress() : " + Arrays.toString(ipAddr));
		
		for(byte i : ipAddr) {
			System.out.print((i<0)? i+256 : i);
			System.out.print(".");
		}
		System.out.println();
		System.out.println("-------localhost-------");
		try {
			// 자기 자신 호스트 정보 얻기
			ip = InetAddress.getLocalHost(); 
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println(
				"HostName : "+ip.getHostName()); 
		System.out.println(
				"HostAddress : "+ip.getHostAddress()); 
		System.out.println(
				"toString() : "+ip);
		
		System.out.println();
		System.out.println(" + + + 프로그램 정상 종료  + + +");
		
		
	}
	
}
