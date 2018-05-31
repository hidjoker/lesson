package ClassBasic;

import classMethod.Method_03;

public class MethodEx_03 {
	
	public static void main(String[] args) {
	
		
		Method_03 m03 = new Method_03();
		
		int[] arr = {1,2,3,4,5};
		
		m03.mul10(arr); //배열의 모든 요소 10배
		
		m03.print(arr); //배열의 모든 요소 출력
		
		

     // arr = {6,7,8,9,10}; // 선언할때 대입이 가능, 이미 선언 후 불가능
		int[] arr2 = {6,7,8,9,10};
		
		// 원본 배열은 그대로 두고
		// 새로운 배열을 반환한다
		// 새로운 배열은 원본배열의 모든 요소를 10배한 것과 같다
		
		int[] result = m03.mul10_v2(arr2);
		
		m03.print(arr2);
		m03.print(result);
		
		
		
		
		
		
	}

}
