package classMethod;

import java.util.Scanner;

public class MethodEx_02 {

	public static void main(String[] args) {
		
		Method_02 m2 = new Method_02();
		
		System.out.println("----1��----");
		m2.sum();
		System.out.println();
		
		
		System.out.println("----2��----");
		Scanner sc = new Scanner(System.in);
		System.out.print("��� Ƚ�� �Է� : ");
		int ad = sc.nextInt();
		m2.out(ad);
		System.out.println();
		
		
		
		System.out.println("----3��----");
		System.out.print("��� Ƚ�� �Է� : ");
		int z= sc.nextInt();
		sc.skip("\r\n");
		System.out.print("���ڿ� �Է� : ");
		String x = sc.nextLine();
		
		
		m2.output(z,x);
		
		
	}	
	

}
