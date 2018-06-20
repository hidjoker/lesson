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
		
		Socket sock = null; //Ŭ���̾�Ʈ ���� ��ü
		
		PrintWriter out = null; //���� ��� ��Ʈ�� ��ü
		BufferedReader in = null; // �Է� ��Ʈ��
		
		Scanner sc = new Scanner(System.in); //Ű���� �Է�
		
	
		try {
			System.out.println(" + + + Ŭ���̾�Ʈ ���� + + +");
			// ���� ��û
			sock = new Socket("localhost",20000); //localhost �ڱ� �ڽ��� ����Ŵ = 127.0.0.1
			
			
			// ��� ��Ʈ�� ����, autoFlush = true
			out = new PrintWriter(
			sock.getOutputStream(), true ); //�ڵ� flush boolean�� print�迭�� ���� 
			
	        // �Է� ��Ʈ�� ����
			
			in = new BufferedReader(
					new InputStreamReader(
							sock.getInputStream() ));
			
			//--------������ ��� -------------
			
			String msg = null; // �޽���
			while(true){
				// ������ ���� �Է�
				System.out.println("\t���� �޽��� : ");
				msg = sc.nextLine();
				
				if("/EXIT".equals(msg)) break;
			
				// ������ ����
				out.println(msg);
				
				msg= in.readLine();
				if(msg==null) break;
				System.out.println("�����޽��� : " + msg);
				
			}
			
			//-------------------------------
			System.out.println(" + + + ��� �Ϸ� + + + ");

		} catch (UnknownHostException e) {	
			System.out.println("[ERROR] �� �� ���� ȣ��Ʈ �Դϴ�");
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ����, ������ ������ �� �����ϴ�");
		}finally {	
			if(out!=null) out.close(); 
			//PrintWriter.close�� ����ó���� ���ص� ��, flush���� ������ �߻����� �ʴ´�
			try {
				if(in!=null) in.close();
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}	
}
