package generics;


// + 와일드 카드
// - 제네릭 타입을 정의할 때 구체적인 타입 대신 사용하는 타입
// - 제네릭의 타입을 어떤 타입으로든 결정될 수 있도록 허용한다
// - 타입 가변성에 영향을 준다
//  <?> : 제한 없는 타입
//  <?  extends 상위> : '상위'타입의 하위클래스로 결정
//  <?  super 하위> : '하위'타입의 상위클래스로 결정 가능



//+ 타입 가변성, Datatype Variant
//- 타입 파라미터 : 제네릭으로 설정된 매개변수, 리턴타입
//- 타입 파라미터가 클래스 계층구조에 미치는 영향
//  (클래스 계층구조 : 컴파일러가 인식하는 데이터타입 체계)
//
//  class A{
//  }
//  class B extends A{
//  }
//
// A는 B가 아니다
// B는 A다  ===> A a = new B();



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsEx_11_Wildcard {
	
//	public static void display(List<Object> l) {
//   에러!! 제네릭 타입은 상속관계와 무관하게 데이터 타입을 일치시켜야 한다(무변성)

	

	public static void display(List<?> l) {
		// List<Object> 와 List<Integer>는 관계가 없기 때문에
		// <Object>대신 <?>를 사용해야만 한다
				
		for(Object o : l) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30);
		display(list); 
		List<String> strList = Arrays.asList("A","B","C");
		display(strList);

		

//		 - 타입 가변성 종류
//		   Parent : 부모클래스
//		   Child : 자식클래스
//
//		   1. 공변성(covariant)
//		    Child는 Parent의 서브타입이라면
//		    Data<Child>는 Data<Parent>의 서브타입이다  
//		   2. 반공변성(contravariant)
//		    Child가 Parent의 서브타입이라면
//		    Data<Parent>는 Data<Child>의 서브타입이다
//		   3. 무변성(invariant)
//		    Data<Child>와 Data<Parent>는 무관하다
		
		
		
		
//		Object a = new Object();
//		Integer b = new Integer(10);
//		a=b;	
//		// 자식클래스 타입은 부모클래스 타입이다(공변성)
//		
//		List<Object> o = new ArrayList<>();
//	    List<Integer> l = new ArrayList<>();
//	    o=l;    //에러
//	    // 자식제네릭타입과 부모제네릭타입은 무관하다(무변성)
		
	
		

	}
}
