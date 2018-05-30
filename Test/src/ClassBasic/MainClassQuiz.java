package ClassBasic;

import java.util.Scanner;

import classMethod.MethodQuiz;

public class MainClassQuiz {
	
	public static void main(String[] args) {
		
		
		MethodQuiz mq = new MethodQuiz();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.println("Input Number2 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 : ");
		String str = sc.nextLine();
		char op = str.charAt(0);
		
		switch(op) {
		case '+' :
			System.out.println(num1 + "+" + num2 "=" + mq.sum(num1, num2) );
			break;
		case '-' :	
		
		}
		
		
				
		
	}
	
	
	
	
	
	

}
