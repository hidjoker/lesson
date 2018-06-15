package stream_FileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx_02 {

	public static void main(String[] args) {
		
		// 출력 대상 파일
		File file = new File("./src/stream_FileStream/","Result"); 
		//파일 객체 생성 시 파일이 없으면 생성
		
		// 파일 출력 스트림 선언
		FileOutputStream fos = null;
		
//		byte[] buf = new byte[1024];
//		buf[0] = 'A';
//		buf[1] = 'B';
		
		String str = "안녕하세요 자바!!";
		byte[] buf = str.getBytes();
		
		try {
			fos = new FileOutputStream(file, false);
			// 생성자의 두번쨰 인자는 append 모드 설정값
			// false(기본값) : 신규 모드
			// true : 추가 모드
			
			//파일 출력 코드
//			fos.write(buf); 
			fos.write(buf, 0, buf.length);
			
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 파일 없음");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 입출력 문제 발생");
		}finally {
			try {
				if(fos!=null) fos.close();
			} catch (IOException e) {
//				e.printStackTrace();
				System.out.println("[ERROR] 파일 닫기 실패");
			}
		}
		
		System.out.println(" + + 프로그램 정상 종료 + +");
		
	}
	
}
