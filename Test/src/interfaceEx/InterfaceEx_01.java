package interfaceEx;

interface Inter_02 {
	public void out();
}

interface Inter_03{
	public void out();
}

class Parent{
	private void out() {
        System.out.println("부모");
	}
}


class ClassTest extends Parent 
                implements Inter_02, Inter_03 {   //인터페이스와 클래스의 상속 out매소드는 하나로 처리 
	@Override
	public void out() {
		System.out.println("자식");
	}
}

public class InterfaceEx_01{
	public static void main(String[] args) {	
		
		ClassTest ct = new ClassTest();
		ct.out();
		
	}
}

// 다중상속 - 자바는 클래스의 다중상속을 금지하고 있음
//class Parent1{
//	private void out() {
//	}
//}
//class Parent2{
//	private void out() {
//	}
//}
//class Child extends Parent1, Parent2{  // - 에러!!
//	
//}

