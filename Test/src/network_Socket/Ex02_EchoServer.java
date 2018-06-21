package network_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_EchoServer {

public static void main(String[] args) {
		
	ServerSocket servSock = null; // ���� ���� ����
	Socket sock = null; // ���� ��� ����
	
	BufferedReader in = null; // �Է� ��Ʈ��
	PrintWriter out = null; // ���� ��� ��Ʈ�� ��ü
	
		try {
			servSock = new ServerSocket(20000);
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
			
			
			// �Է� ��Ʈ�� ����
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
			
			
			// ��� ��Ʈ�� ����, autoFlush = true
			out = new PrintWriter(
					sock.getOutputStream(), true ); //�ڵ� flush boolean�� print�迭�� ���� 
			
			
			// ----- ������ ��� ------
			
			String msg = null;
			while((msg = in.readLine())!=null) {
				System.out.println("�����޽���>> " + msg);
				out.println(msg); // ECHO
			}
			
			
			// ---------------------

			System.out.println(" + + + Ŭ���̾�Ʈ ���� ���� + + + ");
			
			
		} catch (IOException e) {
			System.out.println(" + + + Ŭ���̾�Ʈ ���� ���� + + + ");
		} finally {
			if(out!=null) out.close(); 
			try {
				if(in!=null) in.close();
				if(sock!=null) sock.close();
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				System.out.println("[ERROR] �ڿ����� ���� ");
			}
		
		}// try end - Ŭ���̾�Ʈ ���� �� ���
		
	 }  

	
  }