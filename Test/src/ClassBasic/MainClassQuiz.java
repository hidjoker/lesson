package ClassBasic;

import java.util.Scanner;

import classMethod.MethodQuiz;

public class MainClassQuiz {
	
	public static void main(String[] args) {
		
		
		MethodQuiz mq = new MethodQuiz();
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		sc.skip("\r\n"); //버퍼 비우기(버퍼의 개행 없애기)
		System.out.print("연산자 입력 : ");
		String str = sc.nextLine();
		char op = str.charAt(0);
		
		
		//잘못된 연산자 입력했을 때 처리
		
		if(op!='+'&&op!='-'&&op!='*'&&op!='/') {
			System.out.println("잘못된 연산기호 입력!!");
//			return; // 리턴 1. 값 반환 2. 중단 => main 메소드 중단
		    break; // 반복(while) 문 중단
		
		}
		
		
 		
		
		switch(op) {
		
		case '+' :
			System.out.println(num1 + "+" + num2 +"=" + mq.sum(num1, num2) );
			break;
		case '-' :	
			System.out.println(num1 + "-" + num2 +"=" + mq.sub(num1, num2));
			break;
		case '*' :
			System.out.println(num1 + "*" + num2 +"=" + mq.mul(num1, num2));
			break;
		case '/' :
			System.out.print(num1 + "/" + num2 + "=");
			System.out.printf("%.2f",mq.div(num1, num2));
			break;
		
//		default :
//			System.out.println("잘못 입력했습니다"); //실행되지 않음			
		
		}
		
	}
	
		
    }
		
		
				
}
	
	
	
	
	
	


