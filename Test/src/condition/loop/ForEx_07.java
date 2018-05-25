package condition.loop;

import java.util.Scanner;

public class ForEx_07 {

	public static void main(String[] args) {
		
	// 첫날에 10원을 예금하고,
	// 다음날에는 전날의 2배를 예금하는 방식으로
    // 보름(15일) 동안 저축한 금액은?

		
		// 반복횟수 : 14번
		// 반복구간 : 2~15

		// 초기식 : n=2
		// 조건식 : n<=15
		// 증감식 : n++
		
		
		// 1. 변수
		
		int won=10, sum=10;
		
		
		
		for(int n=2 ; n <= 15 ; n++) {
		
			won *= 2;
			sum += won;
			
		}
		
		System.out.println("저축한 금액은 : " + sum + "원");
		
		
		
		// 입력한 수의 약수를 모두 구하시오(약수 = 어떤 수를 나누어 떨어뜨리는 수)
			
		System.out.print(" Input Num : ");
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		int m=0;
		
		for(int n=1 ; n <= num ;n++) {
			
			if(num % n ==0) {
				System.out.print(n + " ");
               m++;               
							}
			
			if(m==6) {
				System.out.println();
				m=1;
				
			}
				
		
	}

	}}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
			
		
		
			
		
		// 반복횟수 :
		// 반복구간 :

		// 초기식 : n=1
		// 조건식 : num % 2 >0
		// 증감식 : n++
			
			
	

