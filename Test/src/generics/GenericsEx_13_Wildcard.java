package generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//3. 반공변성
//  Child가 Parent의 서브클래스라면
//  Data<Parent>는 Data<? super Child>의 서브타입이다
//  ex)    void display(List<? super Integer> list){
//      }
//       display(new List<Number>);



public class GenericsEx_13_Wildcard {

	public static void display(List<? super Integer> l) { //반공변성
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
