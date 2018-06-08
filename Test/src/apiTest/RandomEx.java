package apiTest;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		// import ����ȭ
		// ctrl+shift+o 
		Random ran = new Random();		//java.lang ��Ű���� �׳� �ᵵ ������ �� �ܿ� ��Ű���� import�� �ؾߵ�			
		System.out.println(ran.nextInt());     //int �������� ������ ����
		System.out.println(ran.nextDouble());  // 0.0(����) ~ 1.0(����) ���̿� ������ ����
		System.out.println(ran.nextBoolean());  
		
		System.out.println("------------");
		System.out.println(ran.nextInt(10)); // 0(����) ~ 10(����) ���̿� ��Ʈ�� ����
		System.out.println(ran.nextInt(10)+1); // 1 ~ 10 ���̿� ��Ʈ�� ����
		
		System.out.println(ran.nextInt(5)); // 0 ~ 4
		System.out.println(ran.nextInt(5)+11); // 11 ~ 15
		
		System.out.println("------------");
		// 1~100 ������ 5���� int[]�� ���
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = ran.nextInt(100)+1; //1~100 ���̿� ����
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}	
}
