package classMethod;

public class Method_03 {

	//0. 메소드의 기본형태 작성
	// public void method(){
	// }
	//1. 메소드 이름 작성하기
	//2. 매개변수 작성
	//3. 코드작성
	//4. return 코드 작성
	//5. return Type
	
	
	//배열의 모든 요소 10배
   public void mul10(int[] a) { // 배열 arr의 얕은 복사
		
		for(int i=0 ; i<5 ; i++) {
			a[i]*=10;
		}
	}
	
   
   // 배열의 모든 요소 출력
   
   public void print(int[] a) { // 배열 arr의 얕은 복사
		
		for(int i=0 ; i<5 ; i++) {
	
			System.out.println(a[i]);
			
		}
	}
	
   
   //원본배열의 모든 요소의 10배를 가지는 새로운 배열 반환
   
   public int[] mul10_v2(int[] a) {
	   
	   int[] res = new int[a.length];
	   for(int i=0 ; i<res.length ; i++) {
		   res[i] = a[i] * 10;
	   }
	   return res;
   }
	
	
   

   
	
	
}
