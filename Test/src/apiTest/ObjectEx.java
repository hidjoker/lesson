package apiTest;

// + JAVA API(Application Programming Interface)
// **API : 응용 프로그램이 OS나 기타 시스템과 상호작용(통신)을
//         할 때 사용되는 메시지 형식(메소드)
//         (자바에서는 Class로 제공된다)
//
// - 응용프로그램을 개발하기 위해 프로그래밍 언어에서 제공하는
//    클래스




//+ Object 클래스
//- 패키지 : java.lang
//- 자바 프로그래밍에서 가장 기본이 되는 클래스
//- 자바의 모든 클래스의 최상위 부모 클래스
// (자바의 모든 클래스는 Object클래스를 상속받고 있다)
//
//- 재정의 불가 메소드
//   notify, wait - 스레드 동기화에 사용
//   getClass() - 클래스타입 정보 반환
//
//
//- 재정의 가능 메소드
//
//  toString() : 객체를 설명하는 문자열 반환
//  equals() : 객체의 동일성 비교(기본)
//              객체의 동등성 비교(재정의해서 사용)
//              (예외 String 데이터 타입)
//**동일성 : 같은 참조를 가지는가(같은 객체인가)
//**동등성 : 같은 데이터를 가지는가
//
//  hashCode() : 참조값 반환
//  Clone() :  객체 복사
//              Cloneable 인터페이스 구현해야한다
//              깊은 복사가 이루어진다
//              재정의해서 사용해야한다(내용수정 불필요)
//
//  finalize() : GC(가비지 컬랙터)가 객체를 파괴할 때
//              호출되는 메소드(건들지 말 것)





class Point implements Cloneable{  
	int x;
	int y;
	
	public Point(int x,int y) {
		setX(x);
		setY(y);
	}
	
	@Override
	public String toString() {
		return "Point ("+x+","+y+")";
		
	}

	@Override
	public boolean equals(Object obj) {
		// p2.equals(p3);
		
		if(this.x ==((Point)obj).getX() && this.y ==((Point)obj).getY()) {
			return true;
			
		}return false;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

public class ObjectEx {

	public static void main(String[] args) {
		
		Object o = new Object();
		
		System.out.println("---toString()----");
		
		// toString()
		// 기능 : 객체에 대한 설명을 String으로 반환
		// 목적 : 객체를 설명
		// 기본동작 : 레퍼런스 반환(데이터타입@참조)
		// 오버라이딩 가능
		
		// println() 메소드가 객체를 전달인자로 받으면
		// 자동으로 객체의 toString()을 호출한 값을 출력하도록 되어있음
		
		
		System.out.println(o.toString());
		System.out.println(o);
			
		
		Point p = new Point(10,20);
		System.out.println(p);
		
		System.out.println("\n---equals()---");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		
		System.out.println("p2 == p3 : " + (p2==p3));
		System.out.println("p2.equals(p3):"+(p2.equals(p3)));	
		
		String str = new String("Apple");
		System.out.println("문자열비교 : " + "Apple".equals(str)); 
		
		
		System.out.println("\n---hashCode()---");
		String str1 = new String("Apple");
		String str2 = new String("Apple");
		String str3 = new String("Banana");
		String str4 = str1;
		
		//객체 생성시 문자열 데이터 타입은 같은 리터럴을 가지면 참조값도 같은 값이 반환된다
		
		System.out.println("str1 : "+str1.hashCode());
		System.out.println("str2 : "+str2.hashCode());
		System.out.println("str3 : "+str3.hashCode());
		System.out.println("str4 : "+str4.hashCode());
		
		System.out.println("p : " + p.hashCode());
		System.out.println("p2 : " + Integer.toHexString(p2.hashCode()));
		
		// toHexString 16진수로 표현
		
		System.out.println("\n---getClass()---");
		System.out.println("p.getClass() : " +p.getClass());
		System.out.println("p.getClass() : " +o.getClass());
		System.out.println("p.getClass() : " +str.getClass());

		System.out.println("\n---Clone()---");
		Point p_ori = new Point(33,44);
		Point p_clone1 = p_ori; // 얕은 복사
		
		// 깊은 복사 - 생성자 이용
		Point p_clone2 = new Point(p_ori.x, p_ori.y);
		
		Point p_clone3 = null;
		try {
			p_clone3 = (Point)p_ori.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //오브젝트 클래스와 다른 패키지로 오류
		System.out.println(p_ori.hashCode());
		System.out.println(p_clone1.hashCode());
		System.out.println(p_clone2.hashCode());
		System.out.println(p_clone3.hashCode());
	}		
	
}

