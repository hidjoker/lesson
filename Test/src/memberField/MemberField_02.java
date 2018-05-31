package memberField;

public class MemberField_02 {

     
	// 클래스 변수, 정적 변수, static 변수
	private static String city = "Seoul";
	
	// 클래스 변수의 Getter
	
	public static String getCity() {
		
		return city;
		
	}
		
	// 클래스 변수의 Setter
	public static void setCity(String city) { // static ->클래스 매소드

		MemberField_02.city = city;  //this : 자기 참조 변수=인스턴스  static(정적) 안에선 사용 안됨
		 			
	}
	
	
	
	
	
	
	
}
