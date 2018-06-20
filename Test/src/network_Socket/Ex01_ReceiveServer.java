package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_ReceiveServer {

	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ����
		Socket sock = null; // ���� ��� ����
		
		BufferedReader in = null; // �Է� ��Ʈ��
		
		try {
			servSock = new ServerSocket(20000); //20000 port�� ���� ����
			System.out.println("+ + + ���� ���� ���� + + +");
			
			System.out.println("Listen Port : "
					+ servSock.getLocalPort() );
			System.out.println("----------------------");
            sock = servSock.accept(); //Listen
			
            // -----BLOCK ----- //
			
			System.out.println("Ŭ���̾�Ʈ ����!!");
			// Ŭ���̾�Ʈ ip���� ���
			InetAddress ip = sock.getInetAddress();
			System.out.println("\t>>Ŭ���̾�Ʈ IP : "
					+ip.getHostAddress()); // IP
			System.out.println("\t>>��ż��� Port : "
					+sock.getPort()); //Port
			
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
			
			// ----- ������ ��� ------
			
			String msg = null;
			while((msg = in.readLine())!=null) {
				System.out.println("�����޽���>> " + msg);
			}
			
			System.out.println(" + + + Ŭ���̾�Ʈ ���� ���� + + + ");
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
				System.out.println(" + + + Ŭ���̾�Ʈ ���� ���� + + +");
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
