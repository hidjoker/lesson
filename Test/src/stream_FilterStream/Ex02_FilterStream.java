package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Ex02_FilterStream {

	public static void main(String[] args) {
		
		// 파일 객체
		File file = new File("./src/stream_FilterStream/","Test");
		
		// 파일 입력 스트림 객체 선언
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// 파일 입력 보조 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼
		int len = -1; //입력 데이터 길이
		
		try {
			// 파일 입력스트림 개설
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			while((len=bis.read(buf))!=-1) {
				System.out.println(new String(buf).trim());
				Arrays.fill(buf, (byte)0);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				//파일스트림 닫기
			    if(bis!=null)bis.close();
			    if(fis!=null)fis.close(); //alt+위,아래 방향키 줄 옮김
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	
		
		
		
		
	}
}
