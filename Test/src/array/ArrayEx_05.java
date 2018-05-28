package array;

public class ArrayEx_05 {

	public static void main(String[] args) {
		
		//문자열 배열
		// String 배열
		// String[]
		
		String[] strArr;
		strArr = new String[3]; // 문자열을 3개 저장할 수 있는 공간
		
		strArr[0] = "Apple" ;
		strArr[1] = "Banana" ;
		strArr[2] = "Cherry" ;
		
		for( int i=0 ; i < strArr.length ; i++) {  // .length 문자열의 갯수
			System.out.println(strArr[i]);
			System.out.println("문자열 길이 : " + strArr[i].length()); // .length() 문자열의 길이
			
			
			
		}
		
		
		
		
		
		
	}
	
	
}
