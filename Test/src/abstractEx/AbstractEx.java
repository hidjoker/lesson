package abstractEx;


//+ abstract Ű����
//- Ŭ������ �޼ҵ忡 ����� �� �ִ� Ű����
//- Ŭ���� : �߻�Ŭ������ ����, �ν��Ͻ��� ������ �� ���� Ŭ����
//- �޼ҵ� : �߻�޼ҵ�� ����, �����ڵ尡 ���� �ҿ����� �޼ҵ�
//- �߻�޼ҵ带 ������ �ִ� Ŭ������ �ݵ�� �߻�Ŭ����������
//
//+ �߻� �޼ҵ�
//- �޼ҵ��� ������(�ٵ�, ��ü)�� ���� �޼ҵ�
//- ����(��üȭ)���� �ʰ� �߻�ȭ�� �޼ҵ�
//- ����
//[����������] abstract [����Ÿ��] [�޼ҵ��] (�Ű�����) ;
//
//+ �߻� Ŭ����
//- ��üȭ(�ν��Ͻ�ȭ) �� �� ���� Ŭ����
// (new �����ڸ� ���� ��ü������ �Ұ����ϴ�)
//
//- �߻�޼ҵ带 ����� ���� �� �ִ� Ŭ����
//- ����
//  [public | default] abstract class [Ŭ������] {
//  }
//- �߻�Ŭ������ ��ӹ޴� �ڽ�Ŭ������ �߻�޼ҵ嵵 ��ӹ޴´�
//
//+ ��ӹ��� �߻�޼ҵ带 ó���ϴ� ���
//
//1. �߻�޼ҵ带 ��ӹ��� �ڽ�Ŭ������ �߻�Ŭ������ ����  
//2. ��ӹ��� �߻�޼ҵ带 �����Ѵ�.
//- �������̵� �ȴ�
//- �ڽ�Ŭ�������� �߻�޼ҵ� ������ ������ �� �ִ�



// �߻�Ŭ����
abstract class Person{
	public String name; //�̸�
	
	// �߻�޼ҵ�
	public abstract void out();
}

class Professor extends Person{
	public String major; //����
	
	public Professor(String major) {
		this.major = major;
    }
	@Override
	public void out() {
		System.out.println("�����Դϴ�");
		System.out.println(major + "�� �����߽��ϴ�");
	}
}

class Student extends Person{
	public String subject; //����
	
    public Student(String subject) {
    	this.subject = subject;
    }
    @Override
    public void out() {
    	System.out.println("�л��Դϴ�");
    	System.out.println(subject + "������ ��� �ֽ��ϴ�");
    }
}

public class AbstractEx {
	
	public static void main(String[] args) {
		
		Person[] arr = new Person[2];
		arr[0] = new Student("�ڹ�");
		arr[1] = new Professor("��ǻ�Ͱ���");
		
		arr[0].out();
		arr[1].out();
	}
}

