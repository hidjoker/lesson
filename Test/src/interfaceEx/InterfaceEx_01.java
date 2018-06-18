package interfaceEx;

interface Inter_02 {
	public void out();
}

interface Inter_03{
	public void out();
}

class Parent{
	private void out() {
        System.out.println("�θ�");
	}
}


class ClassTest extends Parent 
                implements Inter_02, Inter_03 {   //�������̽��� Ŭ������ ��� out�żҵ�� �ϳ��� ó�� 
	@Override
	public void out() {
		System.out.println("�ڽ�");
	}
}

public class InterfaceEx_01{
	public static void main(String[] args) {	
		
		ClassTest ct = new ClassTest();
		ct.out();
		
	}
}

// ���߻�� - �ڹٴ� Ŭ������ ���߻���� �����ϰ� ����
//class Parent1{
//	private void out() {
//	}
//}
//class Parent2{
//	private void out() {
//	}
//}
//class Child extends Parent1, Parent2{  // - ����!!
//	
//}

