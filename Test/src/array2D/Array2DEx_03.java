package array2D;

import java.util.Scanner;

public class Array2DEx_03 {

	public static void main(String[] args) {
		
		// 1~3학년
		// 2개반
		// 4명
		// 3과목 점수
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] s1 = new int[2][4][3];
		int[][][] s2 = new int[2][4][3];
		int[][][] s3 = new int[2][4][3];
		
		// 2명의 국어, 영어, 수학 점수를 저장하는 배열
		
		int[][] sco = new int[2][3];
		int[] sum; // 총점 배열
		double[] avg; // 2명의 평균 배열
		

		
		// 1. 점수 입력
		
		// 2. 평균 계산
		
		// 3. 출력
		
		// 4. 출력
		// ex) 번호 국어  영어  수학  총점  평균
		//     1번  ??? ??? ??? ??? ???
		//     2번  ??? ??? ??? ??? ???  
		
		
		Scanner sc = new Scanner(System.in);
		int[][] scor = new int[2][5];
		
		// 입력 //
		
		int sum1=0, sum2=0;
		int avg1=0, avg2=0;
		
		for(int i=0 ; i<2 ; i++) {
			for(int q=0 ; q<3; q++) {
			System.out.print("["+i+"]["+q+"] 의 점수는 : ");
				scor[i][q] = sc.nextInt();
			if(i==0) {
				sum1 += scor[i][q];
			}
			if(i==1) {
				sum2 += scor[i][q];
			}
				
			}
			
		}
		scor[0][3] = sum1;
		scor[1][3] = sum2;
		scor[0][4] = sum1 / 3;
		scor[1][4] = sum2 / 3;
		
		
		// 출력 //
		for(int i=0 ; i<3 ; i++) { 
			if(i==0) {
				System.out.print("번호   국어   영어   수학   총점   평균");
			}else {
			for(int q=0 ; q<6 ; q++) {
				if(i==1&&q==0) {
					System.out.print("1번   ");
				}
				else if(i==2&&q==0) {
					System.out.print("2번   ");
				}else {					
				System.out.print(scor[i-1][q-1]+"   ");
				}
			}
		}
		System.out.println();
		}
		
		
		
 		
		
				
		
	}
	
	
}
