package stream_FileStream;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
		// File Class
		// 파일 정보를 다루는 클래스
		
//		File file = new File("D:\\storage\\lesson\\Test\\src\\stream_FileStream\\Hello"); //절대경로 지정
		File file = new File("./src/stream_FileStream/Hello"); //상대경로 지정(현재위치를 기준)
		//프로젝트 익스플로러 -> show in -> system explorer(경로확인)
		
//		//escape sequence
//		//escape character(제어문자)
//		
//		String str = "\t";  //수평 탭
//		String str1 = "\b"; //Backspace
//		String str2 = "\r"; //Carriage Return
//		String str3 = "\n"; //New Line
//		String str4 = "\a": // Alarm 자바에서 불가
//		
//		System.out.println("100\\");  제어문자로 읽는 것을 방지하기 위해 \\ 두번 입력
		
		
		System.out.println("toString() : " + file); // 경로
		System.out.println("length() : "+file.length()); //byte단위
		System.out.println("exists() : "+file.exists());
		
		System.out.println("--------");
		System.out.println("canRead() : "+file.canRead());   //읽기 권한
		System.out.println("canWrite() : "+file.canWrite());   //쓰기 권한
		
		System.out.println("--------");
		System.out.println("isDirectory() : " + file.isDirectory()); //디렉토리인지 파일인지 구분
		

//		+ 절대 경로, Absolute Path
//		  - 루트디렉토리로부터 모든 경로를 나타낸 것
//		  - "D:\\FileTest.txt"
//
//		+ 상대 경로, Relative Path
//		  - 프로그램이 자신이 실행된 위치를 기준으로
//		    상대적으로 경로를 나타낸 것
//
//		  ** 프로그램이 실행된 위치 = 클래스패스, Classpath
		  
//		.\ - 현재 위치
//		..\ - 부모 디렉토리
//
//		- 이클립스의 자바프로젝트 CLASSPATH는 프로젝트 폴더로 설정됨

		


		
		
		
		
		
		
		
    }
		
}
