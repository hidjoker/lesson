package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {

	public static void main(String[] args) {
		
		
		// ���������� ���� �����
	
		// int user : ������Է�(1~3)
		// int com : ��ǻ�� ����(1~3)
		
		// 1 : ����, 2 : ����, 3 : ��
		
		// I. Random�� �̿��Ͽ� com�� �� ����
		// II. user�� �Է¹ޱ�
		// III. com, user ��(���������� �º�)
		// IV. ��� ���(����)
		
		// V. I~IV �ݺ�..
		
		
		int user, com;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====���������� ����======");
			do {
				System.out.print("Input num(1-����, 2-���� , 3-��) :");
				user=sc.nextInt();
			}while(user<1||user>3);
	
			com=ran.nextInt(3)+1;
			
		    if(com==1)System.out.println("com�� ������ �½��ϴ�");
		    if(com==2)System.out.println("com�� ������ �½��ϴ�");
		    if(com==3)System.out.println("com�� ���� �½��ϴ�");
	
			if((user!=1&&user-com==1)||(user==1&&com==3)) {
				System.out.println("[���] ���̽�! user�� �̰���ϴ�");
			}else if(user==com) {
				System.out.println("[���] �����ϴ�");
			}else {
				System.out.println("[���] �̷�.. com�� �̰���ϴ�");
			}
			
		}
		
		
	}
	
}
