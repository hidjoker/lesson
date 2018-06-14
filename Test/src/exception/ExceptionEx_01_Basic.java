package exception;


// + 예외 발생 시 체크사항
//  1. 예외 클래스 이름(추가적으로 계층구조도 같이)
//   ex) java.lang.ArrayIndexOutOfBoundsException
//   해석 : 배열의 합당하지 않은 인덱스를 접근하려고 시도할 때 발생
//
//  2. 발생 지점
//   ex) at exception.ExceptionEx_01_Basic.main(ExceptionEx_01_Basic.java:12)
//
//   해석 :  exception 패키지 exceptionEx_01_Basic클래스 main 매소드에 
//            ExceptionEx_01_Basic.java 라는 파일에 12번째 라인
//
//  3. 에러 메시지
//   ex) : 3
//   해석 : index 3에서 문제가 발생했다




public class ExceptionEx_01_Basic {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int i = 0;
		
		
		while(true) {
			
			//예외처리코드
			if( i >= arr.length) {
				System.out.println("인덱스는"+arr.length+"보다 크면 안된다");
				break;
			}
			
	
			arr[i] = i+1;
			System.out.println(arr[i]);
			
			i++;			
		}
	
	}

}
