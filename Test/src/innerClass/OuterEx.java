package innerClass;

//+ 내부 클래스, Inner Class
//
//- 클래스 내부에 정의된 다른 클래스
//
//- 4가지 형태
//1. 멤버 중첩 클래스(= Instance Class)
//	: 클래스의 멤버로 정의된 내부 클래스
//	  인스턴스 변수와 같은 취급을 당한다
//	  객체생성 시 외부클래스의 인스턴스를 통해 생성할 수 있다
//
//2. 정적 중첩 클래스(= Static Class)
//	: 멤버 중첩 클래스에 static 키워드를 붙인 클래스
//     정적 멤버를 가질 수 있게 된다
//
//3. 지역 중첩 클래스(= Local Inner Class)
//	: 메소드의 지역스코프(Local Scope, 중괄호 안)에서 정의된
//     클래스
//     메소드 내에서만 사용할 수 있는 클래스
//
//4. 익명 중첩 클래스(= Anonymous Inner Class)
//   : 클래스 정의와 동시에 객체를 생성하는 방법
// 	 객체를 한번 생성한 뒤 정의 코드를 재사용할 수 없다
//    (1회용 클래스)
//    주로 인터페이스를 이용하여 정의 및 구현을 한다
//    이벤트리스너를 구현할 떄 사용되는 문법이다
//   **이벤트리스너 : 이벤트에 대한 동작을 정의한 코드


public class OuterEx {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		System.out.println( o.num );
		System.out.println("-------");
		
		Outer.MemberInner memIn;
		memIn = o.new MemberInner(); //인스턴스를 통한 호출을 해야함
//		memIn = new Outer.MemberInner(); //static으로 호출 불가
		
	    System.out.println(memIn.num);
	    System.out.println("-------");
	    
	    System.out.println(Outer.staticNum);
	    System.out.println(Outer.StaticInner.num);
	    Outer.StaticInner.out();
	    
	    o.out();
	    

		
	}
}
