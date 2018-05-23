


 /*
  * + 연산, Operation
  * - 계산
  * - 프로그램에서 데이터를 가공하는 것
  * - 하나 이상의 연산자(operator)와 피연산자(operand)로 구성
  *   ex) 1 + 3
  *   ex) +3
  *   
  *     
  * + 연산자, Operator
  *  - 수행할 연산을 나타내는 기호
  *  
  * + 연산자 분류 방법
  *   1. 기능에 따라 분류
  *    산술, 관계, 논리, 대입, 기타
  *         
  *   2. 피연산자 갯수에 따른 분류
  *    이항, 단항, 삼항
  *      
  *
  * 
  *    
  */

package operator;

public class BinaryEx_01 {

	public static void main(String[] args) {
		//산술연산자
		
		int num1 = 17;
		int num2 = 4;
				
		
		// int result = 17 + 4;
		// int result = 21;
		
		
		//** 대입연산자 = 
		//** 오른쪽 항의 값을 왼쪽 항의 변수에 저장한다
		
		
		int result = num1 + num2;
		System.out.println("결과 : " + result);
		
		
		System.out.println("--------");
		System.out.println(num1 + num2); //add(덧셈)
		System.out.println(num1 - num2); //sub(빼기)
		System.out.println(num1 * num2); //mul(곱하기)
		System.out.println(num1 / num2); //div(나누기)
		System.out.println(num1 % num2); //mod(나머지)

		System.out.println("--------");
		System.out.println(num1 / (double)num2); //소수
		                                                // 17 / (double)4 
		                                                // 17.0(자동 형변환) / 4.0 (강제형변환)
		                                                // 4.2500000
		                                                // (double)num1 / num2 = (double)num1 / (double)num2 = 4.2500000
		
		
		System.out.println((double)num1 / num2);
		System.out.println("-----");
		// double 데이터의 나머지 연산
		System.out.println(num1%(double)2);
		System.out.println(num1%2.4);
		
		System.out.println("----예외사항----");
		// System.out.println( 11 / 0);
		//= java.lang.ArithmeticException: / by zero at operator.BinaryEx_01.main(BinaryEx_01.java:75)
        System.out.println(12.34 / 0); //= Infinity
        
        
		
		
		
		
	
		
	}
	
	
	
	
	
	
}
