package stream_ByteStream;

// + OutputStream 주요 메소드
// - void write(int b) throws IOException
//   출력스트림으로 b에 해당하는 문자 출력
//   (ASCII 한글자 출력)
// - void write(byte[] b) throws IOException
//   출력스트림으로 b배열 출력
//   b.length만큼 출력한다(빈공간도 공백문자로 출력됨)
// - void write(byte[] b, int off, int len) throws IOException
//   출력스트림으로 b배열의 off인덱스부터 len만큼 출력




import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_01_Write {

	public static void main(String[] args) {
		
	    OutputStream os;
	    
	    os = System.out; //PrintStream(System.out)(자식클래스) -> OutputStream(부모클래스)
	    
//	    os.println(); //println 메소드는 자식클래스 메소드이므로 사용못함
	    
//	    PrintStream ps;  //PrintStream(자식클래스)로 객체를 생성하면 println메소드 사용가능
//	    ps = System.out;
//	    ps.println();
	    
	    try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(10);  //개행 ASCII 코드 //os.write('\n');
			
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
