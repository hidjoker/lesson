package exception;

public class ExceptionEx_06_throw {
	
	public static void main(String[] args) {
		
		// 예외 발생시키기
//		throw new NullPointerException();
		
		
//		 + 예외 발생시키기
//		  - throw new 예외클래스(); 
//		   (Exception e = new Exception();)
//		   (throw e;)
//		 
//		   (throw new NullPointException();)
//		  - 특정상황에 개발자가 직접 예외를 발생시킬 때 사용
		
//		 + 예외 떠넘기기, 예외처리 미루기
//		  - throws 예외클래스 :
//		     [접근제한자] [리턴타입] 메소드명(매개변수) [throws 예외클래스]{
//		     }
//		  - throws가 적용된 메소드를 호출하려면 반드시 예외를 처리해야한다
//		   (예외처리를 하지 않으면 문법에러가 난다)
//
//		 + 예외 처리 방법
//		   1. throws 적용하기
//		   2. try - catch구문 적용하기


		
		try {
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("널포인터 참조 예외 발생");
		}catch(Exception e) {
			System.out.println("모든 예외 처리");
		}finally {
			System.out.println("무조건 실행되는 코드");
		}
		
		System.out.println(" + + 프로그램 정상 종료 + +");
		
	}
}
