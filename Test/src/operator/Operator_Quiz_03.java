package operator;

import java.util.Scanner;

public class Operator_Quiz_03 {

	public static void main(String[] args) {
		
		
		// �� ���� �Է� �޾� ū ���� ����Ͻÿ�
		// ���ǿ����� ���
		
		// ex)
		
		// Input Number1 : 123        <- ���� �Է�
		// Input Number2 : 333        <- ���� �Է�
		// �� ū ���� 333 �Դϴ�.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		System.out.print(num1 < num2? "�� ū ���� "+num2+"�Դϴ�." : (num1 > num2 ? "�� ū ���� "+num1+"�Դϴ�": "" ));
				
				
	}
		
		
}
