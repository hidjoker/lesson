package condition.star;

public class Star_11 {

	public static void main(String[] args) {
		
		for(int n=0 ; n <5 ; n++) {
			
			for(int m=0 ; m<5 ; m++) {
				
				if(m>=n) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
}


