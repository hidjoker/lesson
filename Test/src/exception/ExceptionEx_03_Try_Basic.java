package exception;

public class ExceptionEx_03_Try_Basic {
	
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
//		//if���� �̿��� ����ó��
//		if(num2!=0)
//		System.out.println( num1 / num2);
		
		
		try {
			System.out.println( num1 / num2);
		} catch (Exception e) {  // e = ArithmeticException
//			e.printStackTrace();
			System.out.println(" >> ���ܹ߻� <<");
			System.out.println(" >> 0���� ���� �� �����ϴ�");
			System.out.println(" >> �������� Ȯ���ϼ���");
		}

		
		System.out.println(" + + ���α׷� ���� + +");
	}

}
