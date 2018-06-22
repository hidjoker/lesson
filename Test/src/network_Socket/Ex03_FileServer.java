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
	
	ServerSocket servSk = null; //서버 소켓
	Socket sock = null; //연결 소켓
	
	File file = new File("./src/network_Socket/","result.txt"); // 파일 객체 생성
	BufferedWriter out = null; // 파일 출력 스트림
	BufferedReader in = null; // 보조 출력 스트림
	
	char[] cbuf = new char[1024]; //입력 보조 버퍼
	int len=-1; 
	int total = 0;
	
	try {
		servSk = new ServerSocket(20000); 
		System.out.println("Listening.....");
		sock=servSk.accept();
		
		System.out.println("연결완료!!!");
		
		out=new BufferedWriter(new FileWriter(file));
		in=new BufferedReader(
				new InputStreamReader(
						sock.getInputStream()));
		
		while((len=in.read(cbuf))!=-1) {
			out.write(cbuf,0,len);
			total+=len;
		}
				
		System.out.println("전송완료!!!");
		System.out.println("전송받은 크기"+total+"byte");
		
		
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
	
	System.out.println("+ + + 프로그램 종료 + + +");
	
	
     }  

}