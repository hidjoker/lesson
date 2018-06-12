package generics;

// + 제네릭 클래스(or 인터페이스) 상속하기
// - 부모 타입의 제네릭을 결정하면서 상속한다
// - 결정되지 않은 부모 타입의 제네릭은 자식클래스가 제네릭타입으로 상속받아야
//   한다
// - 자식타입만의 제네릭 추가 가능


class Parent01<T>{
	T data1;
	
}

class Child01 extends Parent01<String>{ 
	
	//상속을 시키면서 제네릭을 정해두면 Parent01클래스의 제네릭이 결정됨
	//data1은 String타입으로 상속된다
	
}

class Parent02<T>{
	
}

class Child02<K> extends Parent02<K>{
	
	//상속받은 제네릭 타입결정 미루기
	
	
}

class Parent03<M>{
	
}

class Child03<M, N> extends Parent03<M>{
	// M : 상속받은 제네릭 타입 미결정
	// N : 자식클래스만의 제네릭 타입
	
}


public class GenericsEx_09_Inheritance {
	
	public static void main(String[] args) {
			
	
		
		
		

	}
}
