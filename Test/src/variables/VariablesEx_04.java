package variables;

public class VariablesEx_04 {
	
	public static void main(String[] args) {
		
		// 실수형 데이터
		System.out.println(123); // int 형 변수
		System.out.println(3.14); // double 형 변수
		System.out.println(3.14f); // float 형 변수
		
		
		// float = 3.14 ; 에러! float형 변수에 double형 자료를 입력할 수 없음
		
		//해결법
		
		float f = (float) 3.14 ; // 3.14 더블형 데이터를 float형 데이터로 변환해서 저장
		double d = 3.14; // 더블형 변수로 저장
		float f1 = 3.14f; // 플로트형 데이터로 저장
		
		// double d = 3.14f ; 에러! double형 변수에 float형 자료를 입력할 수 없음
		
		//해결법 위와 같은 방식으로
		
		double d1 = (double) 3.14f;
		
		
		/*
		 * 데이터 형 변환(Type Casting)
		 * - 변수에는 같은 타입의 데이터만 저장할 수 있다.
		 * - 변수에 다른 타입의 데이터를 저장하려면 형변환이 필요하다.
		 * - 강제 형변환(명시적 형변환)
		 *    표현 범위가 큰 데이터를 작은 변수에 저장할 떄 
		 *    
		 *    ex) int num = (int) 3.14; // num에는 3으로 저장된다
		 *    
		 * - 자동 형변환(묵시적 형변환)
		 *    표현 범위가 작은 데이터를 큰 변수에 저장할 때
		 *    
		 *    double d = 100;  // 100.0으로 저장
		 *    
		 *    - 연산
		 *    12 + 34.56 // int + double (x)
		 *    12.0 + 34.56 // double + double (ㅇ)
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}

}
