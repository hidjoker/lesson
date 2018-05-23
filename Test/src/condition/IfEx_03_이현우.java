package condition;

import java.util.Scanner;

public class IfEx_03_이현우 {

	public static void main(String[] args) {
		
       
		
		// if 사용
		// 숫자 하나를 입력받아
		// 양수일 경우 "양수"라고 출력하고
		// 음수일 경우 "음수"라고 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		
		System.out.print("Input Num : ");
		num = sc.nextInt();
		
		
		
		if(num < 0) 
		{
			System.out.println("음수");
			
		}else
		{
			System.out.println("음수가 아니다");
			
		}
			
		
		
		
		
		
		
	}
	
}
	
