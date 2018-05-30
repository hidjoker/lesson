package ClassBasic;

public class ClassEx_03 {
	
//	+ 접근제한자
//	
//	- private : 해당 클래스 내에서만 접근 가능
//	
//	- default : 같은 패키지의 접근 허용
//	
//	- protected : 같은 패키지의 접근 + 상속관계의 객체 접근 허용
//	
//	- public : 모든 접근 허용
	
	private int num1 = 10;
	int num2 = 20; // default 접근제한자
	protected int num3 = 30;
	public int num4 = 40;
	

	
//	+ 적용 위치
//	
//	- 클래스
//	   public 과 default만 가능
//	- 멤버 필드
//	- 멤버 메소드

		
	
	public void setNum1(int data) {
		num1 = data;
		
		
	}
		
		
}


	
	
	 
    
	
	
	
