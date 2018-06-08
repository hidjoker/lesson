package apiTest;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		
		// import 최적화
		// ctrl+shift+o 
		Random ran = new Random();		//java.lang 패키지는 그냥 써도 되지만 그 외에 패키지는 import를 해야됨			
		System.out.println(ran.nextInt());     //int 범위에서 난수값 리턴
		System.out.println(ran.nextDouble());  // 0.0(포함) ~ 1.0(제외) 사이에 더블형 난수
		System.out.println(ran.nextBoolean());  
		
		System.out.println("------------");
		System.out.println(ran.nextInt(10)); // 0(포함) ~ 10(제외) 사이에 인트형 난수
		System.out.println(ran.nextInt(10)+1); // 1 ~ 10 사이에 인트형 난수
		
		System.out.println(ran.nextInt(5)); // 0 ~ 4
		System.out.println(ran.nextInt(5)+11); // 11 ~ 15
		
		System.out.println("------------");
		// 1~100 난수중 5개를 int[]에 담기
		int[] arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = ran.nextInt(100)+1; //1~100 사이에 난수
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
	}	
}
