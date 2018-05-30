package classMethod;

import java.util.Scanner;

public class MethodEx_02 {

	public static void main(String[] args) {
		
		Method_02 m2 = new Method_02();
		
		System.out.println("----1번----");
		m2.sum();
		System.out.println();
		
		
		System.out.println("----2번----");
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 횟수 입력 : ");
		int ad = sc.nextInt();
		m2.out(ad);
		System.out.println();
		
		
		
		System.out.println("----3번----");
		System.out.print("출력 횟수 입력 : ");
		int z= sc.nextInt();
		sc.skip("\r\n");
		System.out.print("문자열 입력 : ");
		String x = sc.nextLine();
		
		
		m2.output(z,x);
		
		
	}	
	

}
