package network_Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex01_SenderClient {


	public static void main(String[] args) {
		
		Socket sock = null; //Ŭ���̾�Ʈ ���� ��ü
		PrintWriter out = null; //���� ��� ��Ʈ�� ��ü
		
		Scanner sc = new Scanner(System.in); //Ű���� �Է�
		
		try {
			System.out.println(" + + + Ŭ���̾�Ʈ ���� + + +");
			// ���� ��û
			sock = new Socket("localhost",20000); //localhost �ڱ� �ڽ��� ����Ŵ = 127.0.0.1
			
			// ��� ��Ʈ�� ����, autoFlush = true
			out = new PrintWriter(
			sock.getOutputStream(), true ); //�ڵ� flush boolean�� print�迭�� ���� 
			
			//--------������ ��� -------------
			
			StringBuffer msg = new StringBuffer();
			while(true){
				// ������ ���� �Է�
				System.out.println("\t���� �޽��� : ");
				msg.append(sc.nextLine());
				
				if("EXIT".equals(new String(msg))) break;
			
				// ������ ����
				out.println(msg);
				msg.delete(0, msg.length());
			}
			
			//-------------------------------
			System.out.println(" + + + ��� �Ϸ� + + + ");

			
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