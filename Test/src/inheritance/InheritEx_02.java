package inheritance;

class Parent02{
	
	protected int num = 12; //��������Ű + ��Ӱ��迡�� ���� ���
//	private String name; // private ���� �����ڷ� �ڽ�Ŭ�������� ����� �� ����
		
	protected void display() {
		
		System.out.println("num : "+ num);
		
		
	
	}
	

	
	}

class Child02 extends Parent02{
	
	private int num;
	
	public void display1() {
		
		System.out.println("num : "+ num);
	
	}

	
}

public class InheritEx_02 {

	public static void main(String[] args) {
	
		Child02 c = new Child02();
		c.display();   // ���� �޼ҵ尡 ���� �ٸ� ��Ű����� protected ���� �����ڸ� ����
		               // �θ�Ŭ������ display�� ������� �ʴ´�			
	}
	
}
