
package scannner;

import java.util.Scanner;

public class ScannerEx_05 {
	
	// 문자열 입력받은 Scanner의 메소드
	// 1.next()
	// 2.nextLine()

	public static void main(String[] args) {
	

		//스캐너 객체변수 생성
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		String str3;
		
		//문자열 입력
		
		System.out.print("Input : ");
		str1 = sc.next(); //공백문자(white space)를 기준으로 함
		                  //**공백문자
		                  // \n : 개행(new line)
		                  // ' ' : 띄어쓰기(space)
		                  // \t : 수평탭(horizontal tab)
		
		str2 = sc.next();
		sc.skip("\r\n");
		
		System.out.print(" Input : ");
		str3 = sc.nextLine();
		
		System.out.println("-----출력-----");
		System.out.println(" str1 : " + str1);
		System.out.println(" str2 : " + str2);
		System.out.println(" str3 : " + str3);
		
		
		

 
		
		
		
	
	}
	
}
