package generics;

import java.util.Arrays;
import java.util.List;

//+ �ڹٿ����� Ÿ�� ������
//1. ������
//   Data<Parent>�� Data<Child>�� �����ϴ�
//   �ڹ��� �⺻ ������

//2. ������
//   Child�� Parent�� ����Ŭ�������
//   Data<Child>�� Data<? extends Parent>�� ����Ÿ���̴�
//   ex) void display(List <? extends Number> list) {
//        }
//        display(new List<integer>);




public class GenericsEx_12_Wildcard {
	
	public static void display(List<? extends Number> l) {
		// ���ϵ�ī�� extends�� �����ϱ� 
				
		for(Object o : l) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(10,20,30);
		display(list); 
		List<String> strList = Arrays.asList("A","B","C");
//		display(strList); // ������ Ÿ���� extends�� ���ѵǾ� StringŸ���� �� �� ����
		
		
	}
}
