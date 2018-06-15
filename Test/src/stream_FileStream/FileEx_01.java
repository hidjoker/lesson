package stream_FileStream;

import java.io.File;

public class FileEx_01 {

	public static void main(String[] args) {
		
		// File Class
		// 파일 정보를 다루는 클래스
		
		File file = new File("D:/FileTest.txt");
		System.out.println("toString() : " + file); // 경로
		System.out.println("length() : "+file.length()); //byte단위
		System.out.println("exists() : "+file.exists());
		
		System.out.println("--------");
		System.out.println("canRead() : "+file.canRead());   //읽기 권한
		System.out.println("canWrite() : "+file.canWrite());   //쓰기 권한
		
		System.out.println("--------");
		System.out.println("isDirectory() : " + file.isDirectory()); //디렉토리인지 파일인지 구분
		
		
		
		
		
		
		
		
		
		
    }
		
}
