package array;

import java.util.Arrays;

public class ArrayEtc_03 {

	public static void main(String[] args) {
		
		// Swap
		// 스왑
		
		int num1 = 11;
		int num2 = 22;
		int tmp;
		
		System.out.println("[전] " + num1 + ":" + num2);
		
		// 스왑
		tmp = num2; //백업
		num2 = num1;
		num1 = tmp; //복원
		
		System.out.println("[후] " + num1 + ":" + num2);
		
		
		
		
		
	}	
	
}
