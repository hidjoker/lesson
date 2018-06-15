package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_03_Write {

	public static void main(String[] args) {
		
	    OutputStream os;
	    
	    os = System.out; //PrintStream(System.out)(자식클래스) -> OutputStream(부모클래스)

	    byte[] buf = new byte[1024];
	    
	    int len = 0;
	    buf[len++] = 65; //'A'   //자동 형변환 (int) -> byte 예외적인 상황
	    buf[len++] = 66; //'B'
	    buf[len++] = 67; //'C'
	    buf[len++] = 10; //'\n'
	    
	    buf[len++] = 'H'; //72   //자동 형변환(char) -> int -> byte
	    buf[len++] = 'i'; //105
	    buf[len++] = '\n'; //10

	    System.out.println("length : "+buf.length);
	    
	    try {
	    	os.write(buf, 0, len);   //1024데이터중 0 ~ len 인덱스까지 출력
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os!=null) os.close();  // 출력스트림 반환
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	     
	    System.out.println(" + + + 프로그램 정상 종료 + + + ");  //close메소드로 출력스트림이 닫히면 출력 안됨
	    
	}

}
