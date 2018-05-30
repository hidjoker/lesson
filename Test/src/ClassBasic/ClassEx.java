package ClassBasic;

public class ClassEx {

	/* + 클래스 정의
	 * 
	 * [접근제한자] [클래스식별자] class [클래스이름]{
	 *   
	 *    //맴버 필드
	 *    
	 *    //맴버 메소드
	 *    
	 *    }
	 *    
	 *    - 접근제한자 : public 또는 아무 것도 안붙임
	 *       public : .java 파일이름과 같은 클래스에 붙임
	 *       안붙임 : 파일명과 같지 않은 클래스에서 사용
	 *    
	 *    - 클래스식별자 : 
	 *         클래스의 용도에 따라 클래스에 특성을 부여하는 키워드
	 *         
	 *         abstract, final, static, 등 ..
	 *         
	 *    - 맴버 필드
	 *          클래스를 구성하는 변수와 상수
	 *          
	 *          객체가 생성될 때 메모리에 할당된다
	 *          (new 연산자를 이용해 객체를 생성함)       
	 *       
	 *    - 맴버 메소드
	 *          클래스(객체) 기능, 행위를 정의한 코드
	 *                  
	 *                  
	 */
	
	
	//멤버필드 선언코드
	
	int num;
	String str;
	
	//멤버메소드 정의코드
	
	public void display() {
		System.out.println("멤버메소드 호출");
		System.out.println("num : " + num);
		System.out.println("str : " + num);
		
	}
	

	
	
}



