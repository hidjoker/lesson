package inheritance;

class Parent{
	
	String name;
	int num;
	int age;

	public void display() {
		
		System.out.println("�θ�Ŭ���� �޼ҵ�");
		
	}
	
}

class Child extends Parent{

	int score;
	
	public void print() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
		
		display(); // ����� ���� display �޼ҵ带 ����
		this.display(); // �ڱ� Ŭ���� �� �ڽ�Ŭ���� �޼ҵ带 ����
		super.display(); //�θ�Ŭ���� �޼ҵ带 ����
		
		// super : �θ�Ŭ���� ���� ��ü
		
	}
	
	
	@Override  // @ ������̼�, annotation	
	public void display() {
		System.out.println("������ �޼ҵ�");	
	}	
	
//	@Override // �ڵ��ϼ� �������̵�(ctrl + space)
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
