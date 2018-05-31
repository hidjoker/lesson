
public class array2Dquiz {
	

	public static void main(String[] args) {
		int[][] arr = new int[5][5];


		// 1번 문제 //


		// 입력부
		int cur = 1;
		for( int i=0; i<5; i++ ) {	// i행
			for( int j=0; j<5; j++ ) {	// j열
				arr[i][j] = cur++;
			}
		}

		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}


		System.out.println("--------------");
		// 2번 문제 //

		// 입력부

		int cur2 = 1;
		for( int i=0 ; i <5 ; i++) {
			for(int j=4 ; j>=0 ; j--) {
				arr[i][j] = cur2++;

			}
		}
		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("--------------");
		// 3번 문제 //

		// 입력부

		int cur3 = 1;
		for( int i=0 ; i <5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				arr[j][i] = cur3++;

			}
		}

		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}


		System.out.println("--------------");
		// 4번 문제 //

		// 입력부
		int cur4 = 1;
		for( int i=0; i<5; i++ ) {	// i행
			for( int j=4; j>=0; j-- ) {	// j열
				arr[j][i] = cur4++;				
			}
		}

		// 출력부 - 수정 금지
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println("--------------");
		// 5번 문제 //

		
		int cur5 = 1;
		
		// 배열 초기화 //
		
		for( int i=0; i<5; i++ ) {	
			for( int j=0; j<5; j++ ) {
				arr[i][j] = 0;
			}
		}
		
		
		// 입력 //

		for(int i=0 ; i<5 ; i++) {
			
			
		

			for(int j=0 ; j<5 ; j++) {		
			
				if(arr[i][j] != 0) continue;
				
				
				arr[i][j] = cur5++;				
							
			}
			

			for(int j=0 ; j<5 ; j++) {	
				
				if(arr[j][4-i] != 0) continue;
				
				arr[j][4-i] = cur5++;	
				
			}
			

			for(int j=4 ; j>=0 ; j--) {
				
				if(arr[4-i][j] != 0) continue;
				
				arr[4-i][j] = cur5++;	

				
			}

			for(int j=4 ; j>=0 ; j--) {	
				
				if(arr[j][i] != 0) continue;

				arr[j][i] = cur5++;	
				
			}


		}


		// 출력 //
		
		for( int i=0; i<5; i++ ) {
			for( int j=0; j<5; j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}			








	} 
}







