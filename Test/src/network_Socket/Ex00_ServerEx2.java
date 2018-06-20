package network_Socket;

//+ ����, Socket
//- TCP/IP�� �̿��ϴ� ��ſ� API
//- SW���� ���� ��ġ(��� ��������)
//- �ڹٿ����� Ŭ������ �����Ǿ�����
//- ���� ��Ʈ��
//    -> ���ο� ����� ��Ʈ���� �����ϰ� ����
//+ ���� ���
//- ������ �̿��� ���
//- ���� ���α׷���
//- Ŭ���̾�Ʈ ���� : Socket class, DatagramPacket class
//- ���� ���� : ServerSocket class, DatagramSocket class
//- CS ���� ������ �̿��� ���
//+ TCP ���α׷���
//+ ��Ʈ��ũ ���α׷���


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex00_ServerEx2 {
	
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader in = null; // �Է� ��Ʈ��
		
		try {
			servSock = new ServerSocket(9988); //9988 port�� ���� ����
			System.out.println("+ + + ���� ���� ���� + + +");
			
			System.out.println("Listen Port : "
					+ servSock.getLocalPort() );
			System.out.println("----------------------");

			sock = servSock.accept();
			System.out.println("Ŭ���̾�Ʈ ����!!");
			// Ŭ���̾�Ʈ ip���� ���
			InetAddress ip = sock.getInetAddress();
			System.out.println("\t>>Ŭ���̾�Ʈ IP : "
					+ip.getHostAddress()); // IP
			System.out.println("\t>>Ŭ���̾�Ʈ host : "
					+sock.getPort()); //Port
			
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
					
			String receive = in.readLine();
			System.out.println("\n\t>>���۵����� : "+receive);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
