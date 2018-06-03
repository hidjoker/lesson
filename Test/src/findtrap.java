
public class findtrap {

	private int[][] arr;
	
	
	public findtrap() {
		
		arr = new int[10][10];		
	}
	
	//��ź�� �Է�//
	
	public void trap(){
		
		// 9 = ��ź 
		this.arr[3][2] = 9;
		this.arr[0][6] = 9;
		this.arr[2][8] = 9;
		this.arr[1][7] = 9;
		this.arr[8][9] = 9;
		this.arr[5][5] = 9;
		this.arr[3][9] = 9;
		this.arr[1][4] = 9;
		this.arr[0][8] = 9;
		this.arr[9][6] = 9;
					
	}
	
	//�迭�� ��� �� �Է�//
	
	public void set() {
		
		for(int i=0; i<10; i++) {
			for(int q=0 ; q<10 ;q++) {
				
				if(arr[i][q]>=9) {
					if(i!=0) {
					arr[i-1][q]+=1;
					if(q!=0) arr[i-1][q-1]+=1;
					if(q!=9) arr[i-1][q+1]+=1;
					}
					
					if(q!=9) arr[i][q+1]+=1;
					if(q!=0) arr[i][q-1]+=1;
					
					if(i!=9) {
				    if(q!=0) arr[i+1][q-1]+=1;
					arr[i+1][q]+=1;
					if(q!=9) arr[i+1][q+1]+=1;
					}
				}
								
			 }
		}	
	}
	
	
	// ��ź �� ���� //
	
	public void trapinit() {
		for(int i=0 ; i<10 ; i++) {
			for(int q=0 ; q<10 ; q++) {
			  if(arr[i][q]>=9)arr[i][q] = 9;
			}
		}
		
	}
	// ��º� //
	
	
	public void printout() {
		System.out.println("============");
		for(int i=0 ; i<10 ; i++) {
			for(int q=0 ; q<10 ; q++) {
				System.out.print(arr[i][q]);
			}
			System.out.println();
			
		}
		System.out.println("============");

	}
	
}

// ���� Ŭ���� //

class findtrap_ver{

	public static void main(String[] args) {
		
		findtrap ft = new findtrap();
		ft.trap();
		ft.set();
		ft.trapinit();
		ft.printout();
	}		
	
}

