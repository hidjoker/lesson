package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_02_Write {

	public static void main(String[] args) {
		
	    OutputStream os;
	    
	    os = System.out; //PrintStream(자식클래스) -> OutputStream(부모클래스)

	    byte[] buf = new byte[1024];
	    
	    buf[0] = 65; //'A'   //자동 형변환 (int) -> byte 예외적인 상황
	    buf[1] = 66; //'B'
	    buf[2] = 67; //'C'
	    buf[3] = 10; //'\n'
	    
	    buf[4] = 'H'; //72   //자동 형변환(char) -> int -> byte
	    buf[5] = 'i'; //105
	    buf[6] = '\n'; //10

	    System.out.println("length : "+buf.length);
	    
	    try {
	    	
	    	os.write(buf);   //1024개 모두 출력 0으로 채워진 데이터는 빈칸으로 채워짐
	
			
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
	     
	    System.out.println(" + + + 프로그램 정상 종료 + + +");  //close메소드로 출력스트림이 닫히면 출력 안됨
	    
	}

}
