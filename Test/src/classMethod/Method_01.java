package classMethod;

public class Method_01 {

	public void method01() {
		
		System.out.println("Hello");

	}
	public void method02(int parameter) {
		
		System.out.println("전달인자 값 : "+parameter);
		
	}
	
	public void method03(int num, String str) {
		
		System.out.println(num + " , " + str);
		
	}
	
	public int returnNum() {
		
		System.out.println("반환(return)이 존재하는 메소드");
	
		return 33;
	}
	
	
	public int add(int n1, int n2) { //메소드 헤드, 정의부
		
		// 메소드의 바디, 구현부
		int result;
		result = n1 + n2;
		
		return result;
	}
	
	// 뺼셈 기능
	public int minus(int num1, int num2) {
		
		return num1 - num2;
				
	}
	
	
}
