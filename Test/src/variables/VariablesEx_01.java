package variables;

public class VariablesEx_01 {

	
/* 변수, Variables
 *  - 데이터(값)을 저장해두는 기억 공간(메모리 공간)
 *  - 자료형에 따라 크기가 정해진다
 *  - 데이터를 저장하는 그릇
 *  - 한순간에 하나의 데이터만 저장할 수 있다
 *  - 저장된 값은 다른 값으로 계속 변경할 수 있다
 *  
 */
	
	
	/*
	 * 변수테스트 1
	 */
	
	//메인 메소드 - 프로그램 시작점
	public static void main(String[] args) {
	
		int num;    // int형 변수 num 선언
		// 4바이트 공간
		// 정수를 저장할 수 있음
		
		num = 123; // 123 데이터 대입
		
		System.out.println(num); // num변수 출력
		
		System.out.println(num + 111); // 덧셈결과 출력
		
		num = 55; // 55 대입
		
		System.out.println(num);
		
/*
 * 변수형 명명 규칙(선언 규칙)
 * -알파벳 대문자
 * -알파벳 소문자
 * -숫자
 * 
 * -숫자로 시작하면 안된다
 * -특수기호는 _와 $만 허용한다.
 * -예약어(keyword)를 사용할 수 없다.
 * 
 * -대문자와 소문자는 구분된다.
 * 
 *int 1stNum; //x
 *int 2ndNum; //x
 *
 *int num1; //ㅇ
 *int num2; //ㅇ
 *
 *int Num; //서로 다른 변수로 인식
 *int num;
 *
 *int my_age; //X, 띄어쓰기 금지
 *
 *int my_age;
 *int myAge ; //선호
 *
 *int int; // 키워드 사용불가 x
 *
 *
 *
 */
		
		
		
	}
}