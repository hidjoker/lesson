package exception;

// + 사용자 정의 예외 만들기
// - API로 제공되는 예외클래스 외에 추가적으로 정의하고 싶은
//   예외를 만드는 것
// - Exception 클래스를 상속받아 구현한다



class EvenException extends Exception{

	@Override
	public String getMessage() { // 예외 상황 정의
		return "짝수가 아닌 숫자를 입력했음";
	}
}

class CheckEven{
	// 홀수를 입력하면 예외가 발생한다
	public void check(int num) throws EvenException{//예외처리 강제
		if(num%2 != 0) { //홀수
				throw new EvenException();
			} 	
		System.out.println("짝수입니다!!!");
	}
}

public class ExceptionEx_10_CustumException {
	
	public static void main(String[] args) {
		
		CheckEven ce = new CheckEven();		
	
		try {
			ce.check(13);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println("홀수를 입력함..");
		}
	}
}
