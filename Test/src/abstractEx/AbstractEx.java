package abstractEx;


//+ abstract 키워드
//- 클래스와 메소드에 사용할 수 있는 키워드
//- 클래스 : 추상클래스로 지정, 인스턴스를 생성할 수 없는 클래스
//- 메소드 : 추상메소드로 지정, 구현코드가 없는 불완전한 메소드
//- 추상메소드를 가지고 있는 클래스는 반드시 추상클래스여야함
//
//+ 추상 메소드
//- 메소드의 구현부(바디, 몸체)가 없는 메소드
//- 구현(실체화)되지 않고 추상화된 메소드
//- 형태
//[접근제한자] abstract [리턴타입] [메소드명] (매개변수) ;
//
//+ 추상 클래스
//- 실체화(인스턴스화) 될 수 없는 클래스
// (new 연산자를 통해 객체생성이 불가능하다)
//
//- 추상메소드를 멤버로 가질 수 있는 클래스
//- 형태
//  [public | default] abstract class [클래스명] {
//  }
//- 추상클래스를 상속받는 자식클래스는 추상메소드도 상속받는다
//
//+ 상속받은 추상메소드를 처리하는 방법
//
//1. 추상메소드를 상속받은 자식클래스를 추상클래스로 만듦  
//2. 상속받은 추상메소드를 구현한다.
//- 오버라이딩 된다
//- 자식클래스에게 추상메소드 구현을 강제할 수 있다



// 추상클래스
abstract class Person{
	public String name; //이름
	
	// 추상메소드
	public abstract void out();
}

class Professor extends Person{
	public String major; //전공
	
	public Professor(String major) {
		this.major = major;
    }
	@Override
	public void out() {
		System.out.println("교수입니다");
		System.out.println(major + "를 전공했습니다");
	}
}

class Student extends Person{
	public String subject; //과목
	
    public Student(String subject) {
    	this.subject = subject;
    }
    @Override
    public void out() {
    	System.out.println("학생입니다");
    	System.out.println(subject + "수업을 듣고 있습니다");
    }
}

public class AbstractEx {
	
	public static void main(String[] args) {
		
		Person[] arr = new Person[2];
		arr[0] = new Student("자바");
		arr[1] = new Professor("컴퓨터공학");
		
		arr[0].out();
		arr[1].out();
	}
}

