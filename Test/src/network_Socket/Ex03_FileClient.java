package network_Socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex03_FileClient {

	public static void main(String[] args) {
		
		Socket sock = null; //소켓 생성
		File file = new File("./src/network_Socket/","data.txt"); // 파일 객체 생성
		BufferedReader in = null; // 파일 입력 스트림
		PrintWriter out = null; // 출력 스트림
		
		char[] cbuf = new char[1024]; // 입력 보조 버퍼
		int len = -1;
		
		try {
			sock = new Socket("127.0.0.1",20000);  //소켓 연결
			out = new PrintWriter(
					sock.getOutputStream(),true); //통신 출력 스트림 개설
			
			in = new BufferedReader(new FileReader(file)); // 파일객체 스트림에 연결
			
			while((len = in.read(cbuf))!=-1) { //파일객체 데이터 읽기
				out.print(new String(cbuf,0,len)); // 읽은 데이터 전송하기
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
		
		
		System.out.println(" + + + 연결 종료 + + +");
		
		
	}	
}
