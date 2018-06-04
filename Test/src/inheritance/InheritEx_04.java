package inheritance;

	
//	+ 상속, inheritance
//	 - 기존의 클래스 코드를 재사용하여 새로운 클래스를 작성  할 수 있게 해주는 문법
//
//	 - 클래스들의 중복되는 코드를 하나의 클래스로 관리할 수 있게 된다.
//
//	+ 상속 문법
//	  
//	  class Parent {
//	  // 상속을 주는 클래스
//	  }
//
//	 class Child extends Parent{		
//	
//	  // 상속을 받는 클래스
//	  }
//
//	  ** 상속을 주는 클래스 : 부모, 수퍼, 상위, Based
//	  ** 상속을 받는 클래스 : 자식, 서브, 하위, Derived(유도된,파생된)
//
//
//
//	+ 부모 클래스 - 자식 클래스
//	 - 부모 클래스 
//	  : 상속을 주는 클래스
//	    추상화 정도가 높은 클래스
//
//	 - 자식 클래스
//	  : 상속을 받는 클래스
//	    추상화 정도가 낮은 클래스
//	          
//	+ 메소드 오버로딩(Overloading)
//	 - 메소드 중복정의
//	 - 같은 이름의 메소드를 매개변수의 타입 or 갯수를
//	   다르게 하여 정의하는 것
//
//	+ 메소드 오버라이딩(Overriding)
//	 - 메소드 재정의
//	 - 상속받은 메소드를 자식클래스가 새롭게 정의하는 것





class Parent04{
	public void display() {
		System.out.println("부모클래스");	
	}
	
}

class Child04 extends Parent04{
	@Override
	public void display() {
		System.out.println("자식클래스");		
	}
	
	public void out() {
		System.out.println("자식 메소드 out()");
		
	}
	
}
public class InheritEx_04 {
	public static void main(String[] args) {
		Parent04 p = new Parent04();
		p.display();
		
		System.out.println("----------------");
		Child04 c = new Child04();
		c.display();
	
		System.out.println("----------------");
		Parent04 pc = (Parent04)new Child04();
		//자식클래스 타입은 부모클래스 타입으로 형변환 가능
		//부모클래스 타입의 변수에 자식클래스를 담을 수 있다
		
		// 형변환 안됨
//		Child04 cp = new Parent04();
		pc.display(); // 오버라이딩 상황에서 인스턴스된 Child04.display()

		// 호출 안됨. 오버라이딩 상황이 아니면 선언된 데이터 타입을 보고 결정함 
//		pc.out();
		
		((Child04)pc).out();
		
		
		
//		+ 바인딩, Binding
//		** bind : 묶다
		
//		- 메소드 호출코드 와 메소드 정의코드(구현부)를 연결하는 것
		
//		- 정적바인딩 : 컴파일 시점에 바인딩
		
//		- 동적바인딩 : 실행 중에 바인딩
		
//		- 자바의 메소드는 동적바인딩을 기본으로 한다
		
		
	}
}