package condition;

public class SwitchEx_01 {

	public static void main(String[] args) {
		
	
	//
	// switch 문
	// switch - case 문
	//
	
	// switch(변수){ // ( ) 안에는 정수값이 온다, char 포함
	// case 값1 :
	// case 값2 :
	// case 값3 :
	// ...
	// default :
	// }
	
	
	int num = 10;
	switch(num) {
	case 10 :
		System.out.println("값은 : 10");
		break; //제어문 중단
	
	case 20 :
		System.out.println("값은 : 20");
	    break; //제어문 중단
	    
	case 30 :
		System.out.println("값은 : 30");
	    break; //제어문 중단
	    
	default :
		System.out.println("디폴트, 적당한 값 없음");
		
	}
	
	
	
}
}