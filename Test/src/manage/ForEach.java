package manage;

public class ForEach {
	
	public static void main(String[] args) {
		
		//for each
		// 배열의 모든 요소를 한번에 관리하기 편하게 해주는 반복문
		
		// for each loop
		
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
//		일반 for loop
		
//		for(int i=0 ; i<arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		//for( 배열요소타입 변수명 : 배열명) {
		// 
		// 배열의 모든 요소를 변수명에 한번씩 담아 코드 반복
		// 
		//
		// }
		
		
		
		for(int num : arr) {
			num +=100;  // num 지역변수 for문 종료시 사라짐 (Call by Value - 원본데이터 변하지 않음)
		}
		
		System.out.println("--------------------");
		
		for(int num : arr) {
			System.out.println(num);
		}
	
		
	}

}
