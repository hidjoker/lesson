package stream_FileStream;

import java.io.File;

public class FileEx_03 {

	public static void main(String[] args) {
		
		//매개변수 1개 - 경로 + 파일
		File file1 = new File("D:/FileTest.txt");
		
		//매개변수 2개 - 경로, 파일
		File file2 = new File("D:/","FileTest.txt");
		
		System.out.println(file1);
		System.out.println(file2);
		System.out.println("-------");
		File file3 = new File("D:/test");
		
//		file3.mkdir(); //경로 상위폴더 한개만 생성
		file3.mkdirs(); //경로 모든 단계의 폴더 생성
		

		
    }
		
}
