package exception;

import java.util.Scanner;

public class ExceptionEx_04_Try_Basic {
	
	public static void main(String[] args) {
		
		
//		+ 예외 처리 구문, Exception Handling
//		 - try - catch 구문

		
		try {
			// try 블록
			// 예외가 발생되는 코드
			// 예외 발생이 예측되는 코드
		
		} catch (ArithmeticException e) {
			// Arithmetic예외 처리 코드
		} catch (NullPointerException e) {
			// NullPointerException예외 처리 코드
		} catch (Exception e) {
			// 위의 catch를 제외한 나머지 예외 처리 코드
		} finally {
			// 예외발생해도 실행
			// 예외발생하지 않아도 실행
			// 주로 자원 해제 코드로 씀
		}
//		Scanner sc = new Scanner(System.in);
//		sc.close(); // 키보드 입력메모리 자원해제 코드(따로 하지않아도 자동적으로 실행됨)
		
		System.out.println("예외처리구문 밖");
		
	}

}
