package operator;

import java.util.Scanner;

public class Operator_Quiz_03 {

	public static void main(String[] args) {
		
		
		// 두 수를 입력 받아 큰 수를 출력하시오
		// 조건연산자 사용
		
		// ex)
		
		// Input Number1 : 123        <- 직접 입력
		// Input Number2 : 333        <- 직접 입력
		// 더 큰 수는 333 입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		System.out.print(num1 < num2? "더 큰 수는 "+num2+"입니다." : (num1 > num2 ? "더 큰 수는 "+num1+"입니다": "" ));
				
				
	}
		
		
}
