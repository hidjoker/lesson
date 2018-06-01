
public class findtrap {

	int[][] arr;
	
	
	public findtrap() {
		arr = new int[10][10];		
	}
	
	//ÆøÅº ÀÔ·Â//
	
	public void trap(int[][] arr){
		
		// 9 = ÆøÅº 
		arr[3][2] = 9;
		arr[0][6] = 9;
		arr[2][8] = 9;
		arr[1][7] = 9;
		arr[8][9] = 9;
		arr[5][5] = 9;
		arr[3][9] = 9;
		arr[1][4] = 9;
		arr[0][8] = 9;
		arr[9][6] = 9;
					
	}
	
	//¹è¿­°ª °è»ê//
	
	public void set(int[][] arr) {
		
		for(int i=0; i<10; i++) {
			for(int q=0 ; q<10 ;q++) {
				
				if(arr[i][q]==9) {
				
						
					arr[i-1][q]+=1;
	                arr[i-1][q-1]+=1;
					arr[i-1][q+1]+=1;
					arr[i][q+1]+=1;
					arr[i][q-1]+=1;
					arr[i+1][q-1]+=1;
					arr[i+1][q]+=1;
					arr[i+1][q+1]+=1;
					
			  }

				
			}
			
		}
		
						
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] arr = new int[10][10];
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
