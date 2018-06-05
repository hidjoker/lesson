package inheritance;

class Parent03{

	protected int num;
	
	public Parent03(){
		System.out.println("�θ� ������");
	}
	
	public Parent03(int num) {
		this.num = num;
		System.out.println("�Ű������ִ� �θ������");
	}
}

class Child03 extends Parent03{
	private int num;
	public Child03() {
		super(123); //�θ������ ȣ��
		System.out.println("�ڽ� ������");
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
		Child03 c = new Child03();   // �ڽ�Ŭ���� ������ ȣ���ϸ� �ڵ����� �θ�Ŭ���� ������ ���� ȣ���
	}
}


//+ super Ű����
//
//- super
//   �θ�ü ����
//   �ڽ�Ŭ�������� �θ� Ŭ������ ����� �����Ϸ��� �� �� ���
//
//- super()
//   �θ� ������ ȣ��
//   �ڽ�Ŭ�������� �θ�Ŭ������ �����ڸ� ȣ���� �� ���
//   �������ڸ� ���� �� ����
//   ���� ȣ���ڵ带 �ۼ����� ������ ����Ʈ �����ڸ� ȣ����