package interfaceEx;

public interface Inter_01 {

	public static final int NUM = 123;
	
	int MAX = 999; // == public static final int NUM 999;
	
//	public void out() {
//	}              
//	에러  
	
	public abstract void out();
	
	public void display(); // == public abstract void display();
	
	
//	+ 인터페이스, interface
//
//	 - 추상메소드와 상수만 멤버로 가지는 일종의 추상클래스
//	  (추상클래스보다 추상화 정도가 높다)
//
//	 - 상수 멤버는 public static final 설정이 기본값이다.
//	 - 해당 키워드를 적지 않아도 기본적으로 적용된다
//
//	 - 클래스가 인터페이스를 구현할 때(상속할 때) implements 사용
//	   (여러 개의 인터페이스 implements 가능)
//
//	 - 클래스가 클래스를 상속할 때 extends 사용
//	   (하나의 클래스만 extends 가능)
//
//	 - 인터페이스가 인터페이스를 상속할 때 externds 사용
//	   (여러 개의 인터페이스 extends 가능)

	
}
