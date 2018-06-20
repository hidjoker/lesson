package network;


//+ ��Ʈ��ũ, Network
// - ���(node)���� �����
// - ��� : Network�� ����� �ý���
//   (��ǻ��, �ֺ���ġ, ��Ʈ��ũ��� ���)
// - ����(Server) : �ٸ� ��忡�� �ϳ� �̻��� ���񽺸� �����ϴ� ���
// - Ŭ���̾�Ʈ(Client) : ���񽺸� �����޴�(�̿��ϴ�) ���
// - ����, Serivice
//   Ŭ���̾�Ʈ���� �����Ǵ� ���
//   Ŭ���̾�Ʈ�� ���Ǹ� ���� ���
//
//+ ��������, Protocol
// - ��űԾ�
// - TCP/IP protocol 
// - ��Ź��, ���� ������ ����, ������ �ּ� ǥ���� ���� ������
// 
// ex) ���1                              ���2
//     ��Ž��� ----------------------->
//                <---------------------- O.K
//      30KB���ۿ���------------------>
//                <---------------------- O.K
//      ����������--------------------->
//                                           �޾Ƽ� ���� ����
//
// + TCP/IP, Transmission Control Protocol / Internet Protocol
//  - TCP : ���� ���� ��������
//  - IP : ��� ��ġ ��������
//
//  - ��Ŷ, Packet (1500B)
//     ��Ʈ��ũ ������ ���޵� �����͸� ���� �������� ���� ����
//
//  - TCP : ��Ŷ���� �����ų� �����ϴ� ������ ���
//  - UDP : �����ͱ׷��� �����ų� �����ϴ� ������ ���
//   (�����ͱ׷� == ��Ŷ)
//   (User Datagram Protocol)
//  - IP : ��Ŷ(�����ͱ׷�)�� �����ϰų� �޴� ������ ���
//
// + TCP vs UDP
//   - TCP : ����������, �ŷڼ��ִ� ���, ������
//   - UDP : �񿬰�������, ��ŷڼ� ���, �ӵ�, ��Ʈ����
//** ���������� : ��尣 ������ Ȯ���� ���� ���
//** �ŷڼ� : �������� �սǿ��θ� üũ
//
// + TCP/IP Protocol ���� ���Ǵ� �ּ�
//   - IP Address : ����� ��ġ�� ��Ÿ���� �ּ�
//         IP Protocol ���� ������ ���¸� ������
//         32bit unsigned int
//         4�ڸ��� ������ ǥ���Ѵ�
//         0~255 . 0~255 . 0~255 . 0~255
//         
//   - Port Number(Address) : ������ ����, ����
//      (������ ���� ���(=���� ��ġ))
//        TCP Protocol ���� ���¸� ���Ѵ�
//        16bit unsigned int
//        0~65535
//        200.200.200.1 : 8088
//           < Ip >     : <Port>
//        1~1023  �� �˷��� ��Ʈ, Well - Known Prot
//        21 : FTP(���� ���� ��������)
//        25 : SMTP(���� ���� ��������)
//        80 : WEB Service, HTTP
//        443 : ���� WEB Service, HTTPS, HTTP over SSL



import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Net01_InetAddress {
	
//	=== �ڹ��� ��Ʈ��ũ ���� Ŭ���� ===
//
//			 + InetAddress Class
//			  - IP ���� ����
//			  - ������ ����
//			  - �����޼ҵ带 �̿��Ͽ� ���� ���;���
//			     ex) getByName(), getLocalHost()
//
//			 ** localhost ( == 127.0.0.1 )
//			    �ڱ��ڽ��� ��Ÿ���� ȣ��Ʈ����(IP)
//			    �ڱ��ڽ��� IP�� ���� �Ͱ� ���� ȿ���� ����

	

	public static void main(String[] args) {
		
		// InetAddress - IP������ �ٷ�� Ŭ����
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("www.iei.or.kr");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println(
				"HostName : "+ip.getHostName()); //��� �̸�, ������
		System.out.println(
				"HostAddress : "+ip.getHostAddress()); //�������� ������ �ִ� ip�ּ�
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
			// �ڱ� �ڽ� ȣ��Ʈ ���� ���
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
		System.out.println(" + + + ���α׷� ���� ����  + + +");
		
		
	}
	
}
