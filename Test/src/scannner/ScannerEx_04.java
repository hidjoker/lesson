package scannner;

import java.util.Scanner;

/* 
 * Quiz
 * �����ι��� ���������� �Է¹޾� �����ϰ� ����ϴ� ���α׷� �ۼ�
 * 
 */

//1. �������� ���� ����
// �̸�, ����, ����, Ű

//2. ������ �˸��� Scanner �޼ҵ� ���

//3. ���

public class ScannerEx_04 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	
		System.out.print("�̸� : ");
		String name = input.nextLine();	
		
		System.out.print("���� : ");
		String gender = input.nextLine();
				
		System.out.print("���� : ");
		int age = input.nextInt();
						
		System.out.print("Ű : ");
		Double height = input.nextDouble();
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height);
		
		
			
	
	}
		
		
		
		
		
	
}



