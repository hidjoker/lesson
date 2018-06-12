package generics;

//+ 일반화프로그래밍
//- 자료형을 일반화(Generalization)하여 프로그래밍하는 것
//- 자바에서는 제네릭을 통해 구현된다
//  int
//  float      ==일반화==> 데이터타입 T
//  double
//  String
//
//-ex) 
//   public void out(String var){ } 
//   public void out(Integer var){ } 
//   => public<T> void out(T var){ }
//
//   => String str = "Hello";
//   => out(str); // out이 호출되면서 T가 String으로 결정된다
//
//   => int num = 100;
//   => out(num); // T가 integer로 결정됨
//
//+ 제네릭, Generics
// - 클래스 또는 메소드에서 사용되는 다양한 데이터타입을 
//   일반화시켜 정의하는 방법
// - 코드 재사용성이 높아진다
// - 타입 안정성을 제공한다
//  ** 타입 안정성
//     객체 또는 메소드가 의도하지 않은 타입으로 
//     사용되는 상황을 방지하는 것
//
// - 클래스와 메소드에 적용할 수 있다
// - 자주 쓰이는 제네릭 타입명
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
		// boolean add(E e); // E == Object 로 취급됨		
		List<String> list2 = new ArrayList<String>();
		// boolean add(String e);
		List<Integer> list3 = new ArrayList<>();
		// boolean add(Integer e);
		
//		list2.add(123); // String 타입만 가능
//		list3.add(true); // Integer 타입만 가능
		
		list1.add("A");
		list1.add(111);
		list2.add("B");
		
		String str1 = (String)list1.get(0); // 제네릭이 오브젝트 타입이므로 형변환
		int num1 = (Integer)list1.get(1);
		
		String str2 = list2.get(0); 
	
		
		
	}
}
