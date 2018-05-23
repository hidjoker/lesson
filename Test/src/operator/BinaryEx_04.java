

package operator;

public class BinaryEx_04 {

	public static void main(String[] args) {
		

		// 논리연산자
		// 논리값(true/false)의 논리식 결과를 반환하는 연산자
		// 논리값의 관계를 따지는 연산
		// AND(&&), OR(||), XOR(자바에 없음), NOT(!)
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		// System.out.println("AND : " + b1 && b2);  //에러 발생
		                                        // 우선순위 +연산자 > &&연산자 
		                                        // =>  AND : true && false
		System.out.println("AND : " + (b1 && b2)); //괄호로 묶어줌 
		System.out.println("OR : " + (b1||b2));
		
		//논리연산의 주 목적 : 관계 연산의 결과를 조합할 때 사용
		
		int num = 57;
		System.out.println((num>=1) && (num<=100));
		// 1. num이 1보다 크거나 같은가?
		// 2. num이 100보다 작거나 같은가?
		
		// 1. 2. 를 동시에 만족하는가?
		
		// -> num은 1~100의 숫자인가
		
		// 1<= num <=100 이런거 안됨 => true <= 100 에러 발생
		
		System.out.println( !((num>=1) && (num<=100)));
		
		System.out.println( (num<1) || (num>100));
		
		
		
	
	}
	
	
}
