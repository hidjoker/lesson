package generics;


// + ���ϵ� ī��
// - ���׸� Ÿ���� ������ �� ��ü���� Ÿ�� ��� ����ϴ� Ÿ��
// - ���׸��� Ÿ���� � Ÿ�����ε� ������ �� �ֵ��� ����Ѵ�
// - Ÿ�� �������� ������ �ش�
//  <?> : ���� ���� Ÿ��
//  <?  extends ����> : '����'Ÿ���� ����Ŭ������ ����
//  <?  super ����> : '����'Ÿ���� ����Ŭ������ ���� ����



//+ Ÿ�� ������, Datatype Variant
//- Ÿ�� �Ķ���� : ���׸����� ������ �Ű�����, ����Ÿ��
//- Ÿ�� �Ķ���Ͱ� Ŭ���� ���������� ��ġ�� ����
//  (Ŭ���� �������� : �����Ϸ��� �ν��ϴ� ������Ÿ�� ü��)
//
//  class A{
//  }
//  class B extends A{
//  }
//
// A�� B�� �ƴϴ�
// B�� A��  ===> A a = new B();



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {
	
//	public static void display(List<Object> l) {
//   ����!! ���׸� Ÿ���� ��Ӱ���� �����ϰ� ������ Ÿ���� ��ġ���Ѿ� �Ѵ�(������)

	

	public static void display(List<?> l) {
		// List<Object> �� List<Integer>�� ���谡 ���� ������
		// <Object>��� <?>�� ����ؾ߸� �Ѵ�
				
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30);
		display(list); 
		List<String> strList = Arrays.asList("A","B","C");
		display(strList);

		

//		 - Ÿ�� ������ ����
//		   Parent : �θ�Ŭ����
//		   Child : �ڽ�Ŭ����
//
//		   1. ������(covariant)
//		    Child�� Parent�� ����Ÿ���̶��
//		    Data<Child>�� Data<Parent>�� ����Ÿ���̴�  
//		   2. �ݰ�����(contravariant)
//		    Child�� Parent�� ����Ÿ���̶��
//		    Data<Parent>�� Data<Child>�� ����Ÿ���̴�
//		   3. ������(invariant)
//		    Data<Child>�� Data<Parent>�� �����ϴ�
		
		
		
		
//		Object a = new Object();
//		Integer b = new Integer(10);
//		a=b;	
//		// �ڽ�Ŭ���� Ÿ���� �θ�Ŭ���� Ÿ���̴�(������)
//		
//		List<Object> o = new ArrayList<>();
//	    List<Integer> l = new ArrayList<>();
//	    o=l;    //����
//	    // �ڽ����׸�Ÿ�԰� �θ����׸�Ÿ���� �����ϴ�(������)
		
	
		

	}
}
