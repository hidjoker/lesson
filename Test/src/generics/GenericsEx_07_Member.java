package generics;

class Data<T>{
	T data;
}

class Class07<T>{ //클래스간의 선언된 제네릭은 서로 독립되어 있다 
	Data<T> d;	
}


	

	
	



public class GenericsEx_07_Member {
	public static void main(String[] args) {
		
		Class07<String> c07 = new Class07<>();
		
		c07.d = new Data(); // 선언된 클래스 제네릭이 다른 제네릭이 결정되는데 영향을 준다
		
		
		
		
	
	}
}
