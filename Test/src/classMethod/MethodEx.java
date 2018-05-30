package classMethod;

public class MethodEx {

	public static void main(String[] args) {
		
		Method_01 m01 = new Method_01();
		
		m01.method01();
		
		m01.method02(100);
		
		m01.method03(111, "Apple");
		
		int res = m01.returnNum();
		
		System.out.println("¹ÝÈ¯ °ª : "+res);
		
		System.out.println(m01.add(55, 77));
		
		System.out.println(m01.minus(15,2));
				
	}
	


	
	
	
	
	
	
}
