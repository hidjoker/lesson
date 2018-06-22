package stream_CharStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderEx {

	public static void main(String[] args) {
		
		File file = new File(
				"./src/stream_CharStream"
				,"Source.txt");
		
		Reader reader = null;  // Reader는 직렬화(1byte단위로 데이터를 쪼개서 전달)와 역직렬화(2byte로 합침)를 동시에 한다
		BufferedReader br = null;
		
		char[] cbuf = new char[1024];
		int len = -1;
		
		try {
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			
			while((len=br.read(cbuf))!=-1) {
//				System.out.print(
//				new String(cbuf, 0, len) );
			
			System.out.print(cbuf);
			Arrays.fill(cbuf, '\0' ); // (char)0
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null) br.close();
				if(reader!=null) reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
