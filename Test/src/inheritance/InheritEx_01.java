package inheritance;

class Parent{
	
	String name;
	int num;
	int age;

	public void display() {
		
		System.out.println("부모클래스 메소드");
		
	}
	
}

class Child extends Parent{

	int score;
	
	public void print() {
		System.out.println("자식클래스 메소드");
		
		display(); // 가까운 블럭의 display 메소드를 실행
		this.display(); // 자기 클래스 즉 자식클래스 메소드를 실행
		super.display(); //부모클래스 메소드를 실행
		
		// super : 부모클래스 참조 객체
		
	}
	
	
	@Override  // @ 어노테이션, annotation	
	public void display() {
		System.out.println("재정의 메소드");	
	}	
	
//	@Override // 자동완성 오버라이드(ctrl + space)
//	public void display() {
//		// TODO Auto-generated method stub
//		super.display();
//	}
	
}

public class InheritEx_01 {

	public static void main(String[] args) {
	
		Parent p = new Parent();
		p.num = 111;
		System.out.println(p.num);
		
		Child c = new Child();
		c.num = 222;
		System.out.println(c.num);

		System.out.println("-------");
		p.display();
		c.display();
		c.print();
		
	
	}
	
}
