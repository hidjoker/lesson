import java.util.Scanner;

public class Quiz2_array_solve {

	public static void main(String[] args) {
		
		
		// int arr[] ���� //
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		
		
		
		// ivert_arr �Է� //
		
		int[] invert_arr = new int[10];
		
		for(int i=0 ; i < arr.length ; i++) {
		
			invert_arr[9-i]= arr[i];
		}
		
		
		
		
		// ¦����° �ε��� ������ ��  - Ȧ����° �ε��� ������ ��//
		
		int total=0;
		
		for(int i=0 ; i < arr.length ; i++) {
			
			if(i%2 == 0) {
			
			total -= invert_arr[i];
			
			}else {
				
			total += invert_arr[i];
			
			}
			
		}
		
		// ���� ���ڴ�� rank_arr�迭�� �Է� // ??
		
		int[] rank_arr = new int[10];
		int rank=1;
		
		for(int i=0 ; i < arr.length ; i++ ) {
			for(int q=0 ; q <arr.length ; q++) {
				if(i!=q) {
					if(arr[i]<arr[q]) {
						rank ++;
						rank_arr[i]=rank;
					}
				}
			}
		}
		
		// ���ı��� �ߴٸ� //
		
		int num = 0;
		int[] over_arr = new int[2];
		int[] ret_arr = new int[6];
		
		for(int i=0 ; i< arr.length ; i++) {
			
			for(int q=0 ; q <arr.length ; q++) {
				
				if(i!=q) {
					
					if(arr[i] == arr[q]) {
						
						
						if(num==0){
							
					
						
						
					}
				}
				
				
			}
			
			
			
		}
				
		
		
		
	
		
		
		}
		
		
		
		
		
		
	}
	
	

