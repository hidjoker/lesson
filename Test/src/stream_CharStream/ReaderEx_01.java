package stream_CharStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx_01 {

	public static void main(String[] args) {
		
		Reader rd = new InputStreamReader(System.in); //System.in (키보드 클래스타입 ByteInputStream)
		Writer wt = new OutputStreamWriter(System.out); //데이터 타입을 int를 갖기 위해 부모클래스 타입으로 생성
		
		int in = -1;
		try {
			while((in=rd.read())!=-1) {
				wt.write(in);
//				wt.flush(); //1번
			}
			wt.flush(); //2번
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
