package operator;

public class UnaryEx_01 {

	public static void main(String[] args) {
		
		// 증감 연산자
		// 증가, 감소 연산자
		// ++ --
		
		// 정수1을 증가시키거나 감소시키는 연산
        // 단항연산자
		
		// num++; // 후위 증가 연산자, 후치 증가 연산자
	    // ++num; // 전위 증가 연산자, 전치 증가 연산자
		
		int num;
		
		
		num = 15;
		System.out.println("before : " + num);
		System.out.println("run : " + num++); //후위증가
		System.out.println("after : " + num);
		System.out.println("-----------------");
		
		num = 15;
		System.out.println("before : " + num);
		System.out.println("run : " + ++num); //전위증가
		System.out.println("after : " + num);
		System.out.println("-----------------");
		
		//변수의 값을 1증가시키는 코드
		//num = num + 1
		//num += 1;
		//num++;
		//++num;
		
		
		
	}
	
}
