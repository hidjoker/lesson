package array2D;

public class Array2DEx_01 {

	public static void main(String[] args) {
		
		
		// 1���� �迭 �ʱ�ȭ
		int[] arr1D = {1,2,3,4,5};
		// arr1D new int[5]		
		
		int[][] arr2D = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
				};
		
		
		for(int i=0 ; i<3 ; i++) { // i��
			for(int j=0 ; j<3 ; j++) { //j��
//				System.out.print(arr2D[i][j]+ " ");
  				System.out.print(arr2D[i][j]+ " ");
			}
			System.out.println(); //�� �ึ�� �ٹٲ�
		
		}
		
	}
		
		
}
	
	
