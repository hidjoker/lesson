package stream_FilterStream;

// + DataStream
// - 자바 기본자료형 데이터를 유지하면서 입출력하는 기능을 제공




import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {

	public static void main(String[] args) {
		
		// 파일 객체 선언
		File file = new File(
				"./src/stream_FilterStream"
				,"DataTest");
		
		// 파일 출력 스트림
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		
		try {
			// 파일 출력 스트림 개설
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);

			dos.writeInt(100);
			dos.writeBoolean(true);
			dos.writeChar('T');
		
			
			// 데이터 출력 스트림 연결
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 스트림 닫기
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
