package constructor;


class Constructor_02{
	
	private int num1;
	private int num2 = 200;
	
	public Constructor_02() { 
		
//		this.num1 = num1;
//		this.num2 = num2;	
		
		this(100,200); //  this 생성자는 가장 위에서 생성. 코드충돌 방지
		
		System.out.println("디폴트 생성자");     // (접근제한자) + 클래스명 생성자
	
	}
    
	public Constructor_02(int num1) {
		
		this(num1,200); // 코드의 재사용성
		
	}	
	
    public Constructor_02(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;		
		
	}
	
	public void out() {
		
		System.out.println("("+num1+","+num2+")");
		
	}
	
}

public class constructorEx_02 {
	
	public static void main(String[] args) {
		
		Constructor_02 cons = new Constructor_02();
		
		cons.out();
		
	}
		
}
