package condition;

import java.util.Scanner;

public class IfElseIfeElseEx {

	public static void main(String[] args) {
		
		// if(조건식1) {
		//         //조건식1이 참일때 수행
	    // }else if(조건식2) {
		//         //조건식1이 거짓이고 
		//         //조건식2가 참일 떄 수행
		// }else if(조건식3) {
		//         //조건식1이 거짓이고
		//         //조건식2도 거짓이고
		//         //조건식3이 참일 때 수행
		// }else {
		//         //위의 모든 조건식이 거짓일 때 수행
		// }
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Input Number : ");
		num = sc.nextInt();
		
		if( num > 0 ) {
			// num이 양수일 경우 수행
			System.out.println("num ["+num+"]은/는 양수");
		} else if( num < 0 ) {
			// num이 양수가 아니고
			// num이 음수일 때 수행
			System.out.println("num ["+num+"]은/는 음수");
		} else {
			// num이 양수가 아니고
			// num이 음수가 아닐 때 수행
			System.out.println("num ["+num+"]은/는 0");
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		
	}
	

