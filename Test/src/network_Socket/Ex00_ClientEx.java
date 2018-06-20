package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex00_ClientEx {
	
	public static void main(String[] args) {
		
		Socket sock = null;
		PrintWriter out = null;
		
		try {
			System.out.println(" + + + Ŭ���̾�Ʈ ���� + + +");
			// ���� ��û
			sock = new Socket("localhost",9988); //localhost �ڱ� �ڽ��� ����Ŵ = 127.0.0.1
			
			// ��� ��Ʈ�� ����
			out = new PrintWriter(
			sock.getOutputStream(), true ); //�ڵ� flush boolean�� print�迭�� ���� 
			
			// ������ ��� - ������ ������ ����
			out.println("Hello");
			
			
//			// ����(���) �Ϸ�
//			out.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {	
			if(out!=null) out.close(); 
			//PrintWriter.close�� ����ó���� ���ص� ��, flush���� ������ �߻����� �ʴ´�
			try {
				if(sock!=null) sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
