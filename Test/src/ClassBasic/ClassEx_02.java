package ClassBasic;

public class ClassEx_02 {
	 
	
//      맴버필드
	
		int num1 = 111;
		int num2 = 222;
	
//		num1 = 10;  //멤버정의 영역에 수행코드 작성 불가
		
		
		
	public static void main(String[] args) {
		

	      ClassEx_02 mc = new ClassEx_02();
	      mc.out();
			
	      
		}

	
	public void out() {		
		
		System.out.println(num1+ " , " + num2);
		
	}
	
}
	
	
	
