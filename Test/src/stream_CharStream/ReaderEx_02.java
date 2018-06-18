package stream_CharStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx_02 {

	public static void main(String[] args) {
		
		Reader rd = new InputStreamReader(System.in); //System.in (키보드 클래스타입 ByteInputStream)
		Writer wt = new OutputStreamWriter(System.out); //데이터 타입을 int를 갖기 위해 부모클래스 타입으로 생성
		
		char[] cbuf = new char[1024];
		int len = -1;
		try {
			while((len=rd.read(cbuf))!=-1) {
				wt.write(cbuf, 0, len);
			}
			wt.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rd!=null) rd.close();
				if(wt!=null) wt.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	
	}
	
}
