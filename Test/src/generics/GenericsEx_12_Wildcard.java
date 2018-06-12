package generics;

import java.util.Arrays;
import java.util.List;

//+ 자바에서의 타입 가변성
//1. 무변성
//   Data<Parent>와 Data<Child>는 무관하다
//   자바의 기본 가변성

//2. 공변성
//   Child가 Parent의 서브클래스라면
//   Data<Child>는 Data<? extends Parent>의 서브타입이다
//   ex) void display(List <? extends Number> list) {
//        }
//        display(new List<integer>);




public class GenericsEx_12_Wildcard {
	
	public static void display(List<? extends Number> l) {
		// 와일드카드 extends로 제한하기 
				
		for(Object o : l) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(10,20,30);
		display(list); 
		List<String> strList = Arrays.asList("A","B","C");
//		display(strList); // 데이터 타입이 extends로 제한되어 String타입은 쓸 수 없다
		
		
	}
}
