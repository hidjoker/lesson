package exception;

import java.io.IOException;

class ThrowsEx{
	public char readChar() throws IOException {
		//throws ���ܻ�Ȳ ó�� ���ѱ��
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
