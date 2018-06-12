package generics;

// + 제네릭 메소드
// [접근제한자] <TYPE1, TYPE2, ...> [리턴타입] [메소드명](..){
//   // 구현코드
//  }
//
//  - 제네릭 타입 결정하는 방법
//    1. 호출 시 메소드명 앞에 직접 명시 
//       객체.<구체적타입>메소드명(전달인자);
//    2. 호출 시 매개변수 타입으로 자동으로 결정되게 하는 방법
//       객체.메소드명(전달인자);
//       -> 단, 매개변수가 제네릭타입이어야 함
//    ex) Myclass cls = new MyClass();
//        cls.<Integer>method1(); //방법 1
//        cls.method2(123); //방법2



class Class05{
	
	public<T> T out(T obj) {  //메소드 제네릭 타입, 리턴 타입, 매개변수 타입
		System.out.println("제네릭 메소드");
		System.out.println("데이터 : "+obj);
		T data = obj; //지역변수로  T타입
		return obj;
	}
	
	
}


public class GenericsEx_05_GenericMethod {
	public static void main(String[] args) {
		
		Class05 c05 = new Class05();
		c05.out(123); // 매개변수의 데이터 타입을 이용해서 자동으로 T가 Integer(박싱)로 결정됨
		c05.out("Alice"); //자동으로 String(박싱)으로 결정
		c05.<Integer>out(555); // 명시적으로 T를 Integer로 결정(타입 안정성)
//		c05.<Integer>out("Bob"); // String 전달 불가
		
	}
}
