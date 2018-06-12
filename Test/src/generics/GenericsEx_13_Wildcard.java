package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//3. �ݰ�����
//  Child�� Parent�� ����Ŭ�������
//  Data<Parent>�� Data<? super Child>�� ����Ÿ���̴�
//  ex)    void display(List<? super Integer> list){
//      }
//       display(new List<Number>);



public class GenericsEx_13_Wildcard {

	public static void display(List<? super Integer> l) { //�ݰ�����
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
	
		List<Number> list = new ArrayList<>();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   display(list);

	   
		
	}
}
