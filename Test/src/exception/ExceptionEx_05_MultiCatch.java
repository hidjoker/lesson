package exception;

import java.util.Scanner;

public class ExceptionEx_05_MultiCatch {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try ���");
		}catch(ArithmeticException | NullPointerException e) {  
			//�ڹ� 1.7v ���Ŀ��� ��밡��
			//ArithmeticException �� NullPointerException ��� ó���ϴ� ����ó���ڵ�
		}
		
		
	}

}
