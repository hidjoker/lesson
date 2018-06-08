package innerClass;

public class Outer {

	public int num = 10;
	public static int staticNum=30;
	
	
	public static class StaticInner{ //inner 클래스는 스태틱이 가능함
		
		static int num=40;
       
		public static void out() {
			
			System.out.println("정적 중첩 클래스");

		}
		
	}
	
	public void out() {
		
		int localNum = 50;
		
		class LocalInner{
			int num = 60;			
			
			private void out() {
				System.out.println("지역 중첩 클래스");
		
			}
	
		}
		
		LocalInner li = new LocalInner();
		
		System.out.println(li.num);
		li.out();
		
	}
	
    public class MemberInner{
    	
    	int num=20;
    	
    	public void print() {
    
    		System.out.println("맴버 중첩 클래스");
    		
    	}
    	
    }
    
    public MemberInner mi = new MemberInner();
    
    
    
    
    
}
