package constructor;

import java.util.Scanner;

class Constructor_01{
	
	private int num1;
	private int num2 = 200;
	
	private static Scanner sc;
	
	
	public Constructor_01() {
		System.out.println("디폴트 생성자");     // (접근제한자) + 클래스명 생성자
			
		num1 = 100;
		num2 = 200;
		
		sc = new Scanner(System.in);
		
	}
		
	public Constructor_01(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;		
		
	}
	
		
	public void out() {
		
		System.out.println("("+num1+","+num2+")");
		
	}
		
	
//	public void Constructor_01() {
//		System.out.println("일반 메소드");   //리턴 타입을 추가하면 매소드로 생성
//	}
//	
	
	
}


public class constructorEx_01 {
	
	public static void main(String[] args) {
		
		Constructor_01 cons01;
		cons01 = new Constructor_01();
		cons01.out();
		
		Constructor_01 cons02;
		cons02 = new Constructor_01(111, 222);  //필드 생성 후 생성자 기능 222출력
		cons02.out();	
	}
		
}
