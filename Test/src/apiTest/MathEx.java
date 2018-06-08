package apiTest;

// + Math 클래스
//
// - 수학(산술) 관련 연산 메소드를 제공하는 클래스
// - 주로 정적멤버로 이루어져 있으며 수학적 연산 결과를 제공함
// - ex)
// // 소수점 첫째자리 반올림
// Math.round(11.234);
// ->11 


public class MathEx {
	public static void main(String[] args) {
		
		// -10의 절대값
		System.out.println("-10의 절대값 : "+Math.abs(-10));
		// 3.7의 올림값
		System.out.println("3.7의 올림값 : "+Math.ceil(3.7));
		// 3.7의 내림값
		System.out.println("3.7의 내림값 : "+Math.floor(3.7));
		// 2.1의 3제곱값
		System.out.println("2.1의 3제곱값 : "+Math.pow(2.1,3));
		// 0.0(포함) ~ 1.0(제외) 사이의 난수(랜덤)
		System.out.println("0.0~1.0사이의 난수 : "+Math.random());
		// 자연상수 e의 3.3제곱
		System.out.println("e의 3.3제곱 : "+ Math.pow(Math.E,3.3));
		// -3.7의 올림값
		System.out.println("-3.7의 올림값 : "+Math.ceil(-3.7));
		// -3.7의 내림값
		System.out.println("-3.7의 내림값 : "+Math.floor(-3.7));
	
	}
	
}
