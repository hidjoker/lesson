package array;

public class ArrayCopyEx_03 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30}; //Source
		int[] arr2; //Destination
		
	
		
		// 깊은 복사 (deep copy)
		// 참조 대상의 내용물을 새로운 공간에 복사하는 것
		// 서로 다른 대상을 참조하고 있어서 서로에게 영향이 없다
		
		
		// 1.Destination에 공간 확보
		//   new 사용해서 새로운 공간할당
		
//		arr2 = new int[3];
        arr2 = new int[arr1.length];
		
		// 2.System 클래스의 API메소드를 이용해서 내용물 복사
		// System.arraycopy
		// (원본이름, 원본시작 인덱스, 사본이름, 사본시작인덱스, 길이)
		System.arraycopy(arr1, 0 , arr2, 0, arr1.length);
				

        for(int i=0 ; i < arr2.length ; i++) {
		    arr2[i] = arr1[i];
        }
		
		System.out.println("-----수정 전-----");
		for(int i=0 ; i<3 ; i++) {
			
			System.out.println(arr1[i]+" : "+arr2[i]);
						
		}
	
		arr1[1] = 88; 
		
		System.out.println("-----수정 후-----");
		for(int i=0 ; i<3 ; i++) {
			
			System.out.println(arr1[i]+" : "+arr2[i]);
						
		}
		
	}
	
}
