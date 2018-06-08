package apiTest;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {

	public static void main(String[] args) {
		
		
		// 가위바위보 게임 만들기
	
		// int user : 사용자입력(1~3)
		// int com : 컴퓨터 랜덤(1~3)
		
		// 1 : 가위, 2 : 바위, 3 : 보
		
		// I. Random을 이용하여 com에 값 저장
		// II. user에 입력받기
		// III. com, user 비교(가위바위보 승부)
		// IV. 결과 출력(승자)
		
		// V. I~IV 반복..
		
		
		int user, com;
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("====가위바위보 게임======");
			do {
				System.out.print("Input num(1-가위, 2-바위 , 3-보) :");
				user=sc.nextInt();
			}while(user<1||user>3);
	
			com=ran.nextInt(3)+1;
			
		    if(com==1)System.out.println("com은 가위를 냈습니다");
		    if(com==2)System.out.println("com은 바위를 냈습니다");
		    if(com==3)System.out.println("com은 보를 냈습니다");
	
			if((user!=1&&user-com==1)||(user==1&&com==3)) {
				System.out.println("[결과] 나이스! user가 이겼습니다");
			}else if(user==com) {
				System.out.println("[결과] 비겼습니다");
			}else {
				System.out.println("[결과] 이런.. com이 이겼습니다");
			}
			
		}
		
		
	}
	
}
