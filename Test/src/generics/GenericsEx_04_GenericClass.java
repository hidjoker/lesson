package generics;

// + 제네릭 클래스
// [접근제한자] 클래스명<TYPE 1, TYPE 2, ...>{
//  // 멤버 정의
// }
//
// - 객체생성 시 제네릭 타입을 결정해주는 것이 좋다
// - 만약 결정하지 않으면 Object로 사용된다
// - 객체 변수 선언에 제네릭타입을 명시해주고
// 객체 생성코드(new)에는 생략하고<>만 적는다(JDK1.7 이후)


// Class04 정의

// T 제네릭 적용
// 멤버필드 T obj 생성
// getter, setter 생성

class Class04<T>{
	T obj;

	public <K> void display(K obj) {   //메소드 따로 제네릭을 정할 수 있음
		System.out.println("데이터 : "+obj);
	}
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}



public class GenericsEx_04_GenericClass {
	public static void main(String[] args) {
		
		Class04<String> c04 = new Class04<>();
		c04.setObj("Apple");
		String fruit = c04.getObj();
		System.out.println("과일 : "+fruit);
		
	}
}
