package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientEx {
	
	public static void main(String[] args) {
		
		Socket sock = null;
		PrintWriter out = null;
		
		try {
			System.out.println(" + + + Ŭ���̾�Ʈ ���� + + +");
			// ���� ��û
			sock = new Socket("localhost",9988); //localhost �ڱ� �ڽ��� ����Ŵ = 127.0.0.1
			
			// ��� ��Ʈ�� ����
			out = new PrintWriter(
			sock.getOutputStream() );
			
			// ������ ��� - ������ ������ ����
			out.println("Hello");
			
			// ����(���) �Ϸ�
			out.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
