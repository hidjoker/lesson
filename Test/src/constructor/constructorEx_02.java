package constructor;


class Constructor_02{
	
	private int num1;
	private int num2 = 200;
	
	public Constructor_02() { 
		
//		this.num1 = num1;
//		this.num2 = num2;	
		
		this(100,200); //  this �����ڴ� ���� ������ ����. �ڵ��浹 ����
		
		System.out.println("����Ʈ ������");     // (����������) + Ŭ������ ������
	
	}
    
	public Constructor_02(int num1) {
		
		this(num1,200); // �ڵ��� ���뼺
		
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
