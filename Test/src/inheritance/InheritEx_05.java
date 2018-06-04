package inheritance;

class Parent05{
	public void display() {
		System.out.println("부모클래스");	
	}
	
}

class Child05 extends Parent05{ //클래스 final - 더 이상 클래스 상속 금지
	@Override
	public void display() { //final -  메소드 오버라이딩 금지
		System.out.println("자식클래스");		
	}

}

class GrandChild05 extends Child05{
	
	public void display() {
		
	}
	
}
	

public class InheritEx_05 {
	public static void main(String[] args) {
		Parent05 p = new Parent05();
	
	}
}

//  + final 키워드
//
//  - 더 이상 확장할 수 없도록 설정하는 키워드
//
//  - 변수
//
//     딱 한번만 값을 초기화할 수 있게 해줌
//     변수를 상수화시킴
//  ex) public final int MAX; //최초 1회 초기화된 후 변경 불가
//
//  - 메소드
//  
//    더 이상 오버라이딩할 수 없도록 설정
//  ex) public final void out(){
//     // 자식클래스에서 더 이상 재정의 불가
//     }
//
//  - 클래스
//
//  더 이상 자식클래스를 생성할 수 없도록 설정
//  ex) public final class Data{
//     // 자식클래스를 만들 수 없음
//     // 상속을 줄 수 없게 설정됨



