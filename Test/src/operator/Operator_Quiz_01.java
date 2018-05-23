package operator;

import java.util.Scanner;

public class Operator_Quiz_01 {

	public static void main(String[] args) {
		
		
		// 국어, 영어, 수학 점수 입력 받기
		// 총점 계산
		// 평균 계산
		
		// 출력
		// 국어 : xxx
		// 영어 : xxx
		// 수학 : xxx
		// 총점 : xxx
		// 평균 : xx.xxxxxxxxx
		
		// **변수 다섯개 다 만들기
		// **추가문제
		//	- 평균 소숫점이하 둘째자리까지 표현가능하면 해보기
		//	- 찾아봐야할것...
	
		Scanner input = new Scanner(System.in);		
		
		System.out.print("국어 : ");
		int kor = input.nextInt();
						
		
		System.out.print("영어 : ");
		int eng = input.nextInt();
		
		
		System.out.print("수학 : ");
		int math = input.nextInt();
		
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		int total = kor+eng+math;
		System.out.println("총점 : " + total);
		double aver = (double)total /3;
		
		
		System.out.printf("평균 : " + "%.2f",aver);		
		
		
		
				

	}
	
	
	
	
}
