package condition;

import java.util.Scanner;

public class IfQuiz_������ {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		// 1�� //
		int num1;
		
		System.out.print("Input Number : ");
		num1 = sc.nextInt();

		
		if(num1 % 3 ==0) {
			System.out.println(num1 +"��/�� 3�� ����Դϴ�");
		}

		else {
			System.out.println(num1 +"��/�� 3�� ����� �ƴմϴ�");
		}

		
		// 2�� //
		
		int num2;
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("ū ���� " + num1);
		}else if(num2 > num1) {
			System.out.println("ū ���� " + num2);
		}else {System.out.println("�����ϴ� �ٽ� �Է��ϼ��� ");
		}
		
		// 3�� //
		
		int num3;
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();

		System.out.print("Input Number3 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2) {if(num1 > num3) {
			System.out.println("���� ū ���� " + num1);
		}else {
			System.out.println("���� ū ���� " + num3);
		}}else if(num2 > num3){
			System.out.println("���� ū ���� " + num2);
		}else {
			System.out.println("���� ū ���� " + num3);
		}
		
		// 4�� //
			
		
		System.out.print("Input Number1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		num2 = sc.nextInt();
		
		int sum = num1+num2;
		if(sum % 2 == 0){ if(sum % 3 == 0 ) {
			System.out.println(sum +"��/�� ¦���̰� 3�� ���");
		}else {
			System.out.println(sum +"��/�� ¦���̰� 3�� ����� �ƴϴ�");
		}} else { if(sum % 3 == 0) {
			System.out.println(sum + "��/��  ¦���� �ƴϰ� 3�� ����̴�");
		}else {
			System.out.println(sum + "��/��  ¦���̰� 3�� ����� �ƴϴ�");
		}}
		
		
		// 5�� //
		
		System.out.print("����1 : ");
		num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		num2 = sc.nextInt();
		
		System.out.print("����3 : ");
		num3 = sc.nextInt();
		
		int avg;
		
		sum = num1 +num2 +num3;
		avg = sum / 3;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
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
	












