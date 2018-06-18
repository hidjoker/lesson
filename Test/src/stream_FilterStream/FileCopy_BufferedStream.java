package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_BufferedStream {

	public static void main(String[] args) {
		
		File file1 = new File("./src/stream_FileStream/","Source.txt");
		File file2 = new File("./src/stream_FileStream/","Dest.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] buf = new byte[1024];
		
		int len = -1;
		int total = 0;
		
		try {
			
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			while((len=bis.read(buf))!=-1) {
				bos.write(buf, 0, len);
				total+=len;
				
//				bos.flush(); // flush메소드는 bos에 쌓인 데이터를 내보냄. close메소드에 이 기능이 포함됨
			}
			
			bos.flush(); // Buffered의 기능을 효율적으로 쓰기 위해 마지막에 flush해주는게 좋다

			
			System.out.println("복사 완료, "+total+" Byte");
	
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 파일 없음");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 입출력 문제 발생");
		} finally {
			
			//스트림 닫기
				try {
					if(bis!=null) bis.close();
					if(fis!=null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
				try {
					if(bos!=null) bos.close(); //bos close가 되지 않으면 내용이 출력되지 않는다
					if(fos!=null) fos.close();
				} catch (IOException e) {
						e.printStackTrace();
				}

		}
		
		
		System.out.println(" + + 프로그램 정상 종료 + + ");
				
		
		
		
	}
	
}
