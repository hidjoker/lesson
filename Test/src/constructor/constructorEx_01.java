package constructor;

import java.util.Scanner;

class Constructor_01{
	
	private int num1;
	private int num2 = 200;
	
	private static Scanner sc;
	
	
	public Constructor_01() {
		System.out.println("����Ʈ ������");     // (����������) + Ŭ������ ������
			
		num1 = 100;
		num2 = 200;
		
		sc = new Scanner(System.in);
		
	}
		
	public Constructor_01(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;		
		
	}
	
		
	public void out() {
		
		System.out.println("("+num1+","+num2+")");
		
	}
		
	
//	public void Constructor_01() {
//		System.out.println("�Ϲ� �޼ҵ�");   //���� Ÿ���� �߰��ϸ� �żҵ�� ����
//	}
//	
	
	
}


public class constructorEx_01 {
	
	public static void main(String[] args) {
		
		Constructor_01 cons01;
		cons01 = new Constructor_01();
		cons01.out();
		
		Constructor_01 cons02;
		cons02 = new Constructor_01(111, 222);  //�ʵ� ���� �� ������ ��� 222���
		cons02.out();	
	}
		
}