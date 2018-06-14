package exception;

import java.io.IOException;

class ThrowsEx{
	public char readChar() throws IOException {
		//throws 예외상황 처리 떠넘기기
		return(char) System.in.read();
	}
}

public class ExceptionEx_08_throws {
	
	public static void main(String[] args) {
	
		 ThrowsEx te = new ThrowsEx();
		 System.out.print("Input : ");
		 try {
			System.out.println(te.readChar());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
