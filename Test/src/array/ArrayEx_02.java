package array;

public class ArrayEx_02 {

	public static void main(String[] args) {
		
		// 변수의 선언과 동시에 초기화
		
		int num = 123;
		
		// 배열의 선언과 동시에 초기화
		
		int[] arr = {1,2,3,4,5};
		
		//int[] arr;
		//arr = new int[5];
		//arr[0] = 1;
		//arr[1] = 2;
		//arr[2] = 3;
		//arr[3] = 4;
		//arr[4] = 5;
		
		
		// 모든 요소(element) 출력
		for(int i=0 ; i < 5 ; i++) {
		System.out.println(arr[i]);
		}

		
		// 모든 요소(element) 대입
				for(int i=0 ; i < 5 ; i++) {
				arr[i] = (i+1) * 10;
				}
				
				System.out.println("-------");

				
	   // 모든 요소(element) 출력
				for(int i=0 ; i < 5 ; i++) {
				System.out.println(arr[i]);
				}

				
		
				
		
		
		
	}
	
	
}
