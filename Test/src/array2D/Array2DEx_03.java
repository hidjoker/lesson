package array2D;

import java.util.Scanner;

public class Array2DEx_03 {

	public static void main(String[] args) {
		
		// 1~3�г�
		// 2����
		// 4��
		// 3���� ����
		int[][][][] score = new int[3][2][4][3];
		
		int[][][] s1 = new int[2][4][3];
		int[][][] s2 = new int[2][4][3];
		int[][][] s3 = new int[2][4][3];
		
		// 2���� ����, ����, ���� ������ �����ϴ� �迭
		
		int[][] sco = new int[2][3];
		int[] sum; // ���� �迭
		double[] avg; // 2���� ��� �迭
		

		
		// 1. ���� �Է�
		
		// 2. ��� ���
		
		// 3. ���
		
		// 4. ���
		// ex) ��ȣ ����  ����  ����  ����  ���
		//     1��  ??? ??? ??? ??? ???
		//     2��  ??? ??? ??? ??? ???  
		
		
		Scanner sc = new Scanner(System.in);
		int[][] scor = new int[2][5];
		
		// �Է� //
		
		int sum1=0, sum2=0;
		int avg1=0, avg2=0;
		
		for(int i=0 ; i<2 ; i++) {
			for(int q=0 ; q<3; q++) {
			System.out.print("["+i+"]["+q+"] �� ������ : ");
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
		
		
		// ��� //
		for(int i=0 ; i<3 ; i++) { 
			if(i==0) {
				System.out.print("��ȣ   ����   ����   ����   ����   ���");
			}else {
			for(int q=0 ; q<6 ; q++) {
				if(i==1&&q==0) {
					System.out.print("1��   ");
				}
				else if(i==2&&q==0) {
					System.out.print("2��   ");
				}else {					
				System.out.print(scor[i-1][q-1]+"   ");
				}
			}
		}
		System.out.println();
		}
		
		
		
 		
		
				
		
	}
	
	
}
