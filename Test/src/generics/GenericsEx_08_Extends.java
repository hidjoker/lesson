package generics;

// + 제네릭 제한하기
//  - <T extends 부모클래스>
//  - T타입은 부모클래스의 하위클래스타입으로만 결정될 수 있다
//  - 인터페이스도 마찬가지로 동작함


public class GenericsEx_08_Extends {
	
	public static void main(String[] args) {
			
		print(123); //static 메소드로 동적 할당 이전에 사용
		print(345.345);
//		print("Apple"); //String타입 에러~!
		
	
	}

	public static<T extends Number> void print(T t1) {
    // T 타입은 Number타입의 자식클래스 타입만 허용(Long,Double,Integer 등..)
		
		System.out.println("--------");
		System.out.println(t1);
		
	}

}
