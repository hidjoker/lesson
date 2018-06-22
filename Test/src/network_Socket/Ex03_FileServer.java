package network_Socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_FileServer {

public static void main(String[] args) {
	
	ServerSocket servSk = null; //���� ����
	Socket sock = null; //���� ����
	
	File file = new File("./src/network_Socket/","result.txt"); // ���� ��ü ����
	BufferedWriter out = null; // ���� ��� ��Ʈ��
	BufferedReader in = null; // ���� ��� ��Ʈ��
	
	char[] cbuf = new char[1024]; //�Է� ���� ����
	int len=-1; 
	int total = 0;
	
	try {
		servSk = new ServerSocket(20000); 
		System.out.println("Listening.....");
		sock=servSk.accept();
		
		System.out.println("����Ϸ�!!!");
		
		out=new BufferedWriter(new FileWriter(file));
		in=new BufferedReader(
				new InputStreamReader(
						sock.getInputStream()));
		
		while((len=in.read(cbuf))!=-1) {
			out.write(cbuf,0,len);
			total+=len;
		}
				
		System.out.println("���ۿϷ�!!!");
		System.out.println("���۹��� ũ��"+total+"byte");
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			if(in!=null)in.close();
			if(out!=null)out.close();
			if(sock!=null)sock.close();
			if(servSk!=null)servSk.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	System.out.println("+ + + ���α׷� ���� + + +");
	
	
     }  

}