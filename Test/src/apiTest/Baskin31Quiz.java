package apiTest;

import java.util.Random;
import java.util.Scanner;

public class Baskin31Quiz {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int num, user, com;
		
		num=0;
		user=0;
		System.out.println("===베스킨라빈스 31 게임 ===");

		while(true) {
			
			System.out.println("===com 차례===");
			
			// 필승법 ai //
			if(num==0) com=2;
			else {
				com= 4 - user;
			}

			// 기본 ai //
			
//			if(num>=27) {
//				com = 30-num;
//				if(com==0) com=1;
//				
//			}else {
//				com = ran.nextInt(3)+1;
//			}
			
			
			
			for(int i=0 ; i<com ; i++) {
				num++;
				System.out.println("Com : "+num);
				if(num==31) {
					System.out.println("나이스! user가 승리했습니다");
					return;
				}
			}
			
			do {
			System.out.println("===user 차례===");
			System.out.print("Input Number(1~3연속 횟수) : ");
			user=sc.nextInt();
			}while(user<1||user>3);
			
			for(int i=0 ; i<user ; i++) {
				num++;
				System.out.println("user : "+num);
				if(num==31) {
					System.out.println("이런.. com이 승리했습니다");
					return;
				}
	
			}		
			
		}
		
		
	}
	
}
