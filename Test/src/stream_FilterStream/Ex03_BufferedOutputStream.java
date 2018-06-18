package stream_FilterStream;


// + BufferedStream
// - 스트림내부에 버퍼를 가지고 있는 보조스트림
// - 입출력 횟수를 줄여서 성능 향상을 유도함


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_BufferedOutputStream {

	public static void main(String[] args) {
		
		// 파일 객체 - 출력 대상
		File file = new File(
				"./src/stream_FilterStream"
				,"TestOutput");
		// 파일 스트림 객체 선언
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			
			bos.write("Orange".getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					// 파일 스트림 닫기
					if(bos!=null) bos.close();
					if(fos!=null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println(" + + + 프로그램 정상 종료 + + +");
		
	
		
		
		
		
	}
}
