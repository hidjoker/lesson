package scannner;

import java.util.Scanner;

/* 
 * Quiz
 * 가상인물의 개인정보를 입력받아 저장하고 출력하는 프로그램 작성
 * 
 */

//1. 개인정보 변수 생성
// 이름, 나이, 성별, 키

//2. 변수에 알맞은 Scanner 메소드 사용

//3. 출력

public class ScannerEx_04 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
	
		System.out.print("이름 : ");
		String name = input.nextLine();	
		
		System.out.print("성별 : ");
		String gender = input.nextLine();
				
		System.out.print("나이 : ");
		int age = input.nextInt();
						
		System.out.print("키 : ");
		Double height = input.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		
			
	
	}
		
		
		
		
		
	
}



