import java.util.Arrays;
import java.util.Scanner;

public class Quiz2_array_solve {

	public static void main(String[] args) {


		// int arr[] ���� //
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

		System.out.println("-------1��---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();




		// ivert_arr �Է� //

		int[] invert_arr = new int[10];

		for(int i=0 ; i < arr.length ; i++) {

			invert_arr[9-i]= arr[i];
		}

		System.out.println("------------2��--------");
		for(int i=0 ; i<invert_arr.length ; i++) {
			System.out.println(invert_arr[i] + " ");

		}
		System.out.println();




		// ¦����° �ε��� ������ ��  - Ȧ����° �ε��� ������ ��//

		int total=0;

		for(int i=0 ; i < arr.length ; i++) {

			if(i%2 == 0) {

				total -= invert_arr[i];

			}else {

				total += invert_arr[i];

			}

		}

		System.out.println("----------3��--------");
		System.out.println("total : "+total);

		// ���� ���ڴ�� rank_arr�迭�� �Է� // ??

		int[] rank_arr = new int[arr.length];
		int rank=1;

		for(int i=0 ; i < arr.length ; i++ ) {
			for(int q=0 ; q <arr.length ; q++) {
				if(i!=q) {
					if(arr[i]<arr[q]) {
						rank ++;					
					}
				}
			}			
			rank_arr[i]=rank;
			rank=1;
		}
		System.out.println("----------4��-------");   


		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<rank_arr.length ; i++) {
			System.out.print(rank_arr[i]+" ");

		}

		System.out.println();


		// ���ı��� �ߴٸ� //

		int c=0;
		int d=0;
		int save=0;
		int e=0;
		int over_arr[] = new int[arr.length];
		int ret_arr[] = new int[arr.length];

		for(int i=arr.length; i>0 ; i--) {
			for(int q=0 ; q<arr.length ; q++) {
				if(i==rank_arr[q]) {
					c++;
					save=q;
				}
			}
			if(c==2) {
				over_arr[d] = arr[save];
				d++;
				c=0;
				save=0;
			}else if(c==1) {
				ret_arr[e] = arr[save];
				e++;
				c=0;
				save=0;
			}
		}


		System.out.println("----------5��-------");   

		for(int i=0; i<d ; i++) {
			System.out.print(over_arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<e ; i++) {
			System.out.print(ret_arr[i]+" ");

		
		}
	}
}



