package condition;

public class SwitchEx_02 {

	public static void main(String[] args) {
		
	
	
	
	int num = 2;
	switch(num*10) {
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
	
	
	char ch = 'q';
		
	switch(ch) {
	case 'Q' :
		System.out.println("대문자 큐");
		break;
	case 113 :
		System.out.println( "소문자 큐");
		break;
	case 'a' : 
		System.out.println("에이");
		break;
	case 'B' :
		System.out.println("비");
		break;
		
	}
	
	if(ch == 'Q') {
		
	}else if(ch =='q') {
		
	}else if(ch =='A') {
		
	}else {
		System.out.println("적당한 문자없음");
	}
	
	}	
}
