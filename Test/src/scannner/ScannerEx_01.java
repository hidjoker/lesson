package scannner;

import java.util.Scanner;

public class ScannerEx_01 {
	public static void main(String[] args) {
		
		// Scanner 객체 생성
		// 키보드 입력을 받을 수 있도록 해주는 기능
		Scanner sc = new Scanner(System.in);
			
				int num; // 변수 선언
				num = sc.nextInt(); // 사용자 입력 대기
				// 키보드의 입력 반응(int형 값이어야 함)
		System.out.println("Input Number : " + num);
		
		
		
			
	}

}
