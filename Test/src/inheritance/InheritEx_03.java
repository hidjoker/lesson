package inheritance;

class Parent03{

	protected int num;
	
	public Parent03(){
		System.out.println("부모 생성자");
	}
	
	public Parent03(int num) {
		this.num = num;
		System.out.println("매개변수있는 부모생성자");
	}
}

class Child03 extends Parent03{
	private int num;
	public Child03() {
		super(123); //부모생성자 호출
		System.out.println("자식 생성자");
		System.out.println(num);
		System.out.println(super.num);
	}
	public Child03(int n) {
		super(n);
		System.out.println(super.num);
		System.out.println(num);
	}
	
}
public class InheritEx_03 {
	public static void main(String[] args) {
		Child03 c = new Child03();   // 자식클래스 생성자 호출하면 자동으로 부모클래스 생성자 먼저 호출됨
	}
}


//+ super 키워드
//
//- super
//   부모객체 참조
//   자식클래스에서 부모 클래스의 멤버에 접근하려고 할 때 사용
//
//- super()
//   부모 생성자 호출
//   자식클래스에서 부모클래스의 생성자를 호출할 때 사용
//   전달인자를 넣을 수 있음
//   따로 호출코드를 작성하지 않으면 디폴트 생성자를 호출함