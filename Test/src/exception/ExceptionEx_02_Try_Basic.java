package exception;

public class ExceptionEx_02_Try_Basic {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
		  for(int i=0 ; true ; i++) {
		     arr[i] = i+1;   // 에러발생! 프로그램중단
			 System.out.println(arr[i]);
		  }
		}catch(Exception e) { // Exception(부모클래스타입) e = ArrayIndexOutOfBoundException
//		  e.printStackTrace(); // printStackTrace() 예외 메세지 출력 메소드
		  System.out.println("+ + + 인덱스 벗어남 + + +");
		}
		System.out.println("프로그램 종료");
	}

}
