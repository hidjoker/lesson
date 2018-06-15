package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_01 {

	public static void main(String[] args) {
		
		// 출력 대상 파일
		File file = new File("./src/stream_FileStream/","Result"); 
		//파일 객체 생성 시 파일이 없으면 생성
		
		// 파일 출력 스트림 선언
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(65); // A 출력, throws. IOException 예외 처리
			fos.write('C'); // 66 출력 (주체 프로그램)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" + + 프로그램 정상 종료 + +");
		
	}
	
}
