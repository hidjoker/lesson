package exception;

public class ExceptionEx_03_Try_Basic {
	
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 0;
		
//		//if문을 이용한 예외처리
//		if(num2!=0)
//		System.out.println( num1 / num2);
		
		
		try {
			System.out.println( num1 / num2);
		} catch (Exception e) {  // e = ArithmeticException
//			e.printStackTrace();
			System.out.println(" >> 예외발생 <<");
			System.out.println(" >> 0으로 나눌 수 없습니다");
			System.out.println(" >> 나눔수를 확인하세요");
		}

		
		System.out.println(" + + 프로그램 종료 + +");
	}

}
