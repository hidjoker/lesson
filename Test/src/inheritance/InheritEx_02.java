package inheritance;

class Parent02{
	
	protected int num = 12; //같은패지키 + 상속관계에서 접근 허용
//	private String name; // private 접근 제한자로 자식클래스에서 사용할 수 없음
		
	protected void display() {
		
		System.out.println("num : "+ num);
		
		
	
	}
	

	
	}

class Child02 extends Parent02{
	
	private int num;
	
	public void display() {
		
		System.out.println("num : "+ num);
	
	}

	
}

public class InheritEx_02 {

	public static void main(String[] args) {
	
		Child02 c = new Child02();
		c.display();   // 메인 메소드가 만약 다른 패키지라면 protected 접근 제한자를 가진
		               // 부모클래스의 display는 실행되지 않는다			
	}
	
}
