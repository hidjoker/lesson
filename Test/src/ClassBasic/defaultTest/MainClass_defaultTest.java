package ClassBasic.defaultTest;

import ClassBasic.ClassEx_03;

public class MainClass_defaultTest {

	
 public static void main(String[] args) {
	
		ClassEx_03 ce = new ClassEx_03();
		
//		System.out.println(ce.num1); // private 접근 제한 에러
//      System.out.println(ce.num2); // default 접근 제한 에러 
//      System.out.println(ce.num3); // protected 접근 제한 에러
        System.out.println(ce.num4);

        
//      ce.num1 = 100;   // default 접근 제한 에러
        ce.setNum1(100); // 접근 제한 public을 이용한 method
	 
	 

 
 
 
 
 
 }
	
	
}
	
	
