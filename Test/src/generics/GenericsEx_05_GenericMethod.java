package generics;

// + ���׸� �޼ҵ�
// [����������] <TYPE1, TYPE2, ...> [����Ÿ��] [�޼ҵ��](..){
//   // �����ڵ�
//  }
//
//  - ���׸� Ÿ�� �����ϴ� ���
//    1. ȣ�� �� �޼ҵ�� �տ� ���� ��� 
//       ��ü.<��ü��Ÿ��>�޼ҵ��(��������);
//    2. ȣ�� �� �Ű����� Ÿ������ �ڵ����� �����ǰ� �ϴ� ���
//       ��ü.�޼ҵ��(��������);
//       -> ��, �Ű������� ���׸�Ÿ���̾�� ��
//    ex) Myclass cls = new MyClass();
//        cls.<Integer>method1(); //��� 1
//        cls.method2(123); //���2



class Class05{
	
	public<T> T out(T obj) {  //�޼ҵ� ���׸� Ÿ��, ���� Ÿ��, �Ű����� Ÿ��
		System.out.println("���׸� �޼ҵ�");
		System.out.println("������ : "+obj);
		T data = obj; //����������  TŸ��
		return obj;
	}
	
	
}


public class GenericsEx_05_GenericMethod {
	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		c05.out(123); // �Ű������� ������ Ÿ���� �̿��ؼ� �ڵ����� T�� Integer(�ڽ�)�� ������
		c05.out("Alice"); //�ڵ����� String(�ڽ�)���� ����
		c05.<Integer>out(555); // ��������� T�� Integer�� ����(Ÿ�� ������)
//		c05.<Integer>out("Bob"); // String ���� �Ұ�
		
	}
}
