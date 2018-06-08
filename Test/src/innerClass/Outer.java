package innerClass;

public class Outer {

	public int num = 10;
	public static int staticNum=30;
	
	
	public static class StaticInner{ //inner Ŭ������ ����ƽ�� ������
		
		static int num=40;
       
		public static void out() {
			
			System.out.println("���� ��ø Ŭ����");

		}
		
	}
	
	public void out() {
		
		int localNum = 50;
		
		class LocalInner{
			int num = 60;			
			
			private void out() {
				System.out.println("���� ��ø Ŭ����");
		
			}
	
		}
		
		LocalInner li = new LocalInner();
		
		System.out.println(li.num);
		li.out();
		
	}
	
    public class MemberInner{
    	
    	int num=20;
    	
    	public void print() {
    
    		System.out.println("�ɹ� ��ø Ŭ����");
    		
    	}
    	
    }
    
    public MemberInner mi = new MemberInner();
    
    
    
    
    
}
