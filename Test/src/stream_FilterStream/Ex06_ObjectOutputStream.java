package stream_FilterStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex06_ObjectOutputStream {

	public static void main(String[] args) {
		

		// 파일 객체 생성
		File file = new File(
				"./src/stream_FilterStream"
				,"ObjectTest");
		
		// 출력 스트림 선언
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		
		try {
			fis = new FileOutputStream(file);
			oos = new ObjectOutputStream(fis);
			
			Point p1 = new Point(11,22);
			Point p2 = new Point(111,222);
			Point p3 = new Point(1111,2222);

			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos!=null) oos.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(" + + + 프로그램 정상 종료 + + +");
		
	}
}
