package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx_01 {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FileStream/","Hello");
		
		FileInputStream fis=null;
		
		// 전체 읽은 데이터 저장
		StringBuffer sb = new StringBuffer();
		int in = -1;
		
		try {
			fis = new FileInputStream(file); //생성자에 throws
			while((in=fis.read())!=-1) { 
				//offset이 이동하면서 EOF값 ^Z(-1)을 찾을때 브레이크
				sb.append((char)in);
			}
		} catch (FileNotFoundException e) { 
			//FileNotFoundException은 IOException의 자식클래스이므로 먼저 둔다
//			e.printStackTrace();
			System.out.println("[ERROR] 파일 존재하지 않음");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 입출력 문제 발생");
		}finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=====읽어온 데이터=====");
		System.out.println(sb);
		System.out.println("====================");
		
		System.out.println(" + + 프로그램 정상 종료 + + ");
		
		
	}
	
}
