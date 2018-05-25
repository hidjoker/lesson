package condition.loop;

import java.util.Scanner;

public class WhileEx_03 {

	public static void main(String[] args) {
	
		
//  숫자 하나를 입력받고
//  1부터 입력한 숫자까지
//  모든 숫자를 더해서 출력하기
//  (while 이용)
		
//  + 생각해볼 것
//  - 필요한 변수(각 역할)
//	- 반복 전에 초기화해야하는 변수
//	- 반복 중 수행할 기능(연산)
//	- 반복 후 결과 처리(출력)	
		
//	 1. 숫자 한 개 변수 선언
		int input;
		
//	 2. 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 덧셈을 구할 숫자는? ");
		input = sc.nextInt();
//	 3. 1~입력한 수 총합 구하기
		int total = 0;
		// 반복횟수 : 입력한 수만큼(input)
		// 반복구간 : 1~input 

		// 초기식 : int i=1;
		// 조건식 : i<=input
		// 증감식 : i++;
		
		int i=1;
		while(i <=input) {
			total += i;
			
			i++;
		}
		
		
		
//	 4. 출력하기
		System.out.println("1부터" + input +"까지의 합 : " + total);
		
		
	
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		int n=1, sum=0;
		
	 while(n<=num) {
		 
		 sum += n;
		 
		 n++;
		 
	 }
		
	 System.out.println(" 총합 : " + sum);
		
		
	 


		
		
	}
}	
