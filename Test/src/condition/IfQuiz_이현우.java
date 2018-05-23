package condition;

import java.util.Scanner;

public class IfQuiz_이현우 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		// 1번 //
		int num1;
		
		System.out.print("Input Number : ");
		num1 = sc.nextInt();

		
		if(num1 % 3 ==0) {
			System.out.println(num1 +"은/는 3의 배수입니다");
		}

		else {
			System.out.println(num1 +"은/는 3의 배수가 아닙니다");
		}

		
		// 2번 //
		
		int num2;
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("큰 수는 " + num1);
		}else if(num2 > num1) {
			System.out.println("큰 수는 " + num2);
		}else {System.out.println("같습니다 다시 입력하세요 ");
		}
		
		// 3번 //
		
		int num3;
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();

		System.out.print("Input Number3 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2) {if(num1 > num3) {
			System.out.println("가장 큰 수는 " + num1);
		}else {
			System.out.println("가장 큰 수는 " + num3);
		}}else if(num2 > num3){
			System.out.println("가장 큰 수는 " + num2);
		}else {
			System.out.println("가장 큰 수는 " + num3);
		}
		
		// 4번 //
			
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();
		
		int sum = num1+num2;
		if(sum % 2 == 0){ if(sum % 3 == 0 ) {
			System.out.println(sum +"은/는 짝수이고 3의 배수");
		}else {
			System.out.println(sum +"은/는 짝수이고 3의 배수는 아니다");
		}} else { if(sum % 3 == 0) {
			System.out.println(sum + "은/는  짝수가 아니고 3의 배수이다");
		}else {
			System.out.println(sum + "은/는  짝수이고 3의 배수가 아니다");
		}}
		
		
		// 5번 //
		
		System.out.print("성적1 : ");
		num1 = sc.nextInt();
		
		System.out.print("성적2 : ");
		num2 = sc.nextInt();
		
		System.out.print("성적3 : ");
		num3 = sc.nextInt();
		
		int avg;
		
		sum = num1 +num2 +num3;
		avg = sum / 3;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70 ) {
			System.out.println("C");
		}else if(avg >= 60 ) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
						
	}
	}
	












