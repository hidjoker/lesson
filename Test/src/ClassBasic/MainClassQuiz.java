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
		sc.skip("\r\n"); //���� ����(������ ���� ���ֱ�)
		System.out.print("������ �Է� : ");
		String str = sc.nextLine();
		char op = str.charAt(0);
		
		
		//�߸��� ������ �Է����� �� ó��
		
		if(op!='+'&&op!='-'&&op!='*'&&op!='/') {
			System.out.println("�߸��� �����ȣ �Է�!!");
//			return; // ���� 1. �� ��ȯ 2. �ߴ� => main �޼ҵ� �ߴ�
		    break; // �ݺ�(while) �� �ߴ�
		
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
//			System.out.println("�߸� �Է��߽��ϴ�"); //������� ����			
		
		}
		
	}
	
		
    }
		
		
				
}
	
	
	
	
	
	


