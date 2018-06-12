package generics;

//+ �Ϲ�ȭ���α׷���
//- �ڷ����� �Ϲ�ȭ(Generalization)�Ͽ� ���α׷����ϴ� ��
//- �ڹٿ����� ���׸��� ���� �����ȴ�
//  int
//  float      ==�Ϲ�ȭ==> ������Ÿ�� T
//  double
//  String
//
//-ex) 
//   public void out(String var){ } 
//   public void out(Integer var){ } 
//   => public<T> void out(T var){ }
//
//   => String str = "Hello";
//   => out(str); // out�� ȣ��Ǹ鼭 T�� String���� �����ȴ�
//
//   => int num = 100;
//   => out(num); // T�� integer�� ������
//
//+ ���׸�, Generics
// - Ŭ���� �Ǵ� �޼ҵ忡�� ���Ǵ� �پ��� ������Ÿ���� 
//   �Ϲ�ȭ���� �����ϴ� ���
// - �ڵ� ���뼺�� ��������
// - Ÿ�� �������� �����Ѵ�
//  ** Ÿ�� ������
//     ��ü �Ǵ� �޼ҵ尡 �ǵ����� ���� Ÿ������ 
//     ���Ǵ� ��Ȳ�� �����ϴ� ��
//
// - Ŭ������ �޼ҵ忡 ������ �� �ִ�
// - ���� ���̴� ���׸� Ÿ�Ը�
//    T - Type
//    E - Element
//    K - Key
//    V - Value
//    N - Number



import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list1 = new ArrayList();
		// => List<Object> list1 = new ArrayList<Object>();
		// boolean add(E e); // E == Object �� ��޵�		
		List<String> list2 = new ArrayList<String>();
		// boolean add(String e);
		List<Integer> list3 = new ArrayList<>();
		// boolean add(Integer e);
		
//		list2.add(123); // String Ÿ�Ը� ����
//		list3.add(true); // Integer Ÿ�Ը� ����
		
		list1.add("A");
		list1.add(111);
		list2.add("B");
		
		String str1 = (String)list1.get(0); // ���׸��� ������Ʈ Ÿ���̹Ƿ� ����ȯ
		int num1 = (Integer)list1.get(1);
		
		String str2 = list2.get(0); 
	
		
		
	}
}
