package overloading;

class Overloading_01{
	
	private int x;
	private int y;
	
	public void display() {
		
		System.out.println("["+x+","+y+"]");
			
	}
	
	// int형 전달인자 2개를 입력받고
    // 멤버필드 x, y를 초기화하고 출력
	
	
	public void display(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		System.out.println("["+x+","+y+"]");
		display();
				
	}
	
	
}

public class OverloadingEx {

	public static void main(String[] args) {
		
		Overloading_01 ol01 = new Overloading_01();		
		
		System.out.println("display()");
		ol01.display();
		System.out.println("display(int,int)");
		ol01.display(10,10);
		
		
		System.out.println("-----------------");
		Overloading_02 ol02 = new Overloading_02();
		
	   System.out.println("길이는 : " + ol02.getLength(112233));
	   
	   
	   System.out.println("123.4547의 길이는 : " + ol02.getLength(123.4547));
	   
	   System.out.println("false의 길이는 : " + ol02.getLength(false));
	   
	   
			
		}
		
	
	public void display(double d) {}
	public void display(String s) {}
	


		
}


