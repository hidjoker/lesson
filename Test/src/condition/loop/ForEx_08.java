package condition.loop;

public class ForEx_08 {

	public static void main(String[] args) {
		
		int num = 10;
		if ( num >= 1 ) {
			if( num <= 100) {
				System.out.println("1~100의 숫자");
			}			
			
			System.out.println("1보다 크거나 같다");
		}
		
		
		// 중첩 for loop
		
		// 추가 고려사항, 바깥쪽 for문의 반복자가 고정된 상태로
		// 안쪽 for문이 새롭게 반복된다
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3 ; j++) {
				System.out.println("i : "+ i + ",j : "+j); //9번
			}
			System.out.println("--------");
			// 3번
		} 
		
		
		
		

		
				
	}
	
}
