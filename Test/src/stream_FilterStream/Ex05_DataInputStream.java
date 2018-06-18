package stream_FilterStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05_DataInputStream {

	public static void main(String[] args) {
		
		// 파일 객체 생성
		
		File file = new File(
				"./src/stream_FilterStream"
				,"DataTest");
		
		// 파일 입력 스트림 선언
		FileInputStream fis = null;
		DataInputStream dis = null;
	
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);

			int resInt = dis.readInt(); // int
			boolean resBoolean = dis.readBoolean(); // boolean
			char resChar = dis.readChar(); // char
			
			System.out.println("int : "+ resInt);
			System.out.println("boolean : "+resBoolean);
			System.out.println("char : "+resChar);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis!=null)dis.close();
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
