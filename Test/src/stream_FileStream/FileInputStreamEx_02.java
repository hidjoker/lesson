package stream_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamEx_02 {

	public static void main(String[] args) {
		
		File file = new File("./src/stream_FileStream/","Hello");
		
		// 파일 입력 스트림 객체 선언
		// try 구문 안에서 객체를 생성하기 때문에
		// 객체 생성 실패를 고려해서 null로 초기화해둔다
		FileInputStream fis=null;
		
		// 전체 읽은 데이터 저장
		StringBuffer sb = new StringBuffer();
		// 한번에 읽어들여 저장하는 배열
		byte[] buf = new byte[1024];
		
		int len = -1; //읽어들인 바이트 수
		int total = 0; //총 읽어들인 바이트 수

		
		try {
			fis = new FileInputStream(file); 
			
			// EOF, End Of File
			while((len=fis.read(buf))!=-1) { 
				//read(buf, 0, len) 입력받은 길이까지 read해서 배열 초기화할 필요가 없다 
				sb.append(new String(buf,0,len));
				System.out.println("읽은 바이트 수 : "+len);
				total += len;
				//buf 배열 초기화
//				Arrays.fill(buf, (byte)0); 
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
		
		System.out.println("=====읽어온 총 바이트 수=====");
		System.out.println(total + " Bytes");
		System.out.println("=====읽어온 데이터=====");
		System.out.println(sb);
		System.out.println("====================");
		
		System.out.println(" + + 프로그램 정상 종료 + + ");
		
		
	}
	
}
