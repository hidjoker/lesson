package network_Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex03_FileClient {

	public static void main(String[] args) {
		
		Socket sock = null; //���� ����
		File file = new File("./src/network_Socket/","data.txt"); // ���� ��ü ����
		BufferedReader in = null; // ���� �Է� ��Ʈ��
		PrintWriter out = null; // ��� ��Ʈ��
		
		char[] cbuf = new char[1024]; // �Է� ���� ����
		int len = -1;
		
		try {
			sock = new Socket("127.0.0.1",20000);  //���� ����
			out = new PrintWriter(
					sock.getOutputStream(),true); //��� ��� ��Ʈ�� ����
			
			in = new BufferedReader(new FileReader(file)); // ���ϰ�ü ��Ʈ���� ����
			
			while((len = in.read(cbuf))!=-1) { //���ϰ�ü ������ �б�
				out.print(new String(cbuf,0,len)); // ���� ������ �����ϱ�
			}	
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(in!=null)in.close();
					if(out!=null)out.close();
					if(sock!=null)sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
		System.out.println(" + + + ���� ���� + + +");
		
		
	}	
}
