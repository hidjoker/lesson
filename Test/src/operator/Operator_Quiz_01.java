package operator;

import java.util.Scanner;

public class Operator_Quiz_01 {

	public static void main(String[] args) {
		
		
		// ����, ����, ���� ���� �Է� �ޱ�
		// ���� ���
		// ��� ���
		
		// ���
		// ���� : xxx
		// ���� : xxx
		// ���� : xxx
		// ���� : xxx
		// ��� : xx.xxxxxxxxx
		
		// **���� �ټ��� �� �����
		// **�߰�����
		//	- ��� �Ҽ������� ��°�ڸ����� ǥ�������ϸ� �غ���
		//	- ã�ƺ����Ұ�...
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = input.nextInt();
						
		
		System.out.print("���� : ");
		int eng = input.nextInt();
		
		
		System.out.print("���� : ");
		int math = input.nextInt();
		
		
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		
		int total = kor+eng+math;
		System.out.println("���� : " + total);
		double aver = (double)total /3;
		
		
		System.out.printf("��� : " + "%.2f",aver);		
		
		
		
				

	}
	
	
	
	
}
