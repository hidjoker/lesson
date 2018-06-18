package generics;

// + ���׸� Ŭ����
// [����������] Ŭ������<TYPE 1, TYPE 2, ...>{
//  // ��� ����
// }
//
// - ��ü���� �� ���׸� Ÿ���� �������ִ� ���� ����
// - ���� �������� ������ Object�� ���ȴ�
// - ��ü ���� ���� ���׸�Ÿ���� ������ְ�
// ��ü �����ڵ�(new)���� �����ϰ�<>�� ���´�(JDK1.7 ����)


// Class04 ����

// T ���׸� ����
// ����ʵ� T obj ����
// getter, setter ����

class Class04<T>{
	T obj;

	public <K> void display(K obj) {   //�޼ҵ� ���� ���׸��� ���� �� ����
		System.out.println("������ : "+obj);
	}
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}



public class GenericsEx_04_GenericClass {
	public static void main(String[] args) {
		
		Class04<String> c04 = new Class04<>();
		c04.setObj("Apple");
		String fruit = c04.getObj();
		System.out.println("���� : "+fruit);
		c04.display(fruit);
	}
}
