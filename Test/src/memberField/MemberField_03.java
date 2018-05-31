package memberField;

public class MemberField_03 {

    //var = 매개변수 
	
	private int num = 777;  //인스턴스 변수
	private static int num2 = 55; // 클래스(static) 변수
	
	
	public void method(int var) {
		
		//지역변수, Local Variables		
		int num = 101;
		
		System.out.println(num); // num이란 변수들중 가까운 변수 사용 지역변수 지칭
		System.out.println(this.num); // 인스턴스 변수num 지칭
		System.out.println();
		
		
		
		
//		+ 클래스에서 생성되는 변수의 유형
//		
//		-인스턴스 변수
//		   일반적인 멤버필드
//		   
//		-클래스 변수
//		   static이 적용된 멤버필드
//		   
//		-지역 변수
//		     메소드에서 선언된 변수
		
		
//		+static메소드(정적메소드) 
//		
//		- 클래스의 맴버를 인스턴스 없이 사용할 수 있게 해준다
//		- 멤버필드, 멤버메소드 모두 적용됨
//		
//		- 인스턴스가 아닌 클래스단위로 제어된다.
//		- 인스턴스 변수를 사용할 수 없다.
//		- 정적메소드에서는 정적변수만 사용해야 한다
//		  (일반메소드에서는 정적변수, 인스턴스 변수 둘 다 사용가능)
		
//		- main() 메소드는 정적메소드
		
		
		
		
		
		
		
		
				     
		
	}
	
	
	public static void method2() {

			
		
//		System.out.println(num); //인스턴스 변수
		System.out.println(num2); // 클래스 변수
	
	
	}
	
	

	
		
		
	
}
		
		
		
		



	
	
	
	
     
     
	

