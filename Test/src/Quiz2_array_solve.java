import java.util.Arrays;
import java.util.Scanner;

public class Quiz2_array_solve {

	public static void main(String[] args) {


		// int arr[] 선언 //
		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};

		System.out.println("-------1번---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();




		// ivert_arr 입력 //

		int[] invert_arr = new int[10];

		for(int i=0 ; i < arr.length ; i++) {

			invert_arr[9-i]= arr[i];
		}

		System.out.println("------------2번--------");
		for(int i=0 ; i<invert_arr.length ; i++) {
			System.out.println(invert_arr[i] + " ");

		}
		System.out.println();




		// 짝수번째 인덱스 내용의 합  - 홀수번째 인덱스 내용의 합//

		int total=0;

		for(int i=0 ; i < arr.length ; i++) {

			if(i%2 == 0) {

				total -= invert_arr[i];

			}else {

				total += invert_arr[i];

			}

		}

		System.out.println("----------3번--------");
		System.out.println("total : "+total);

		// 높은 숫자대로 rank_arr배열에 입력 // ??

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
		System.out.println("----------4번-------");   


		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<rank_arr.length ; i++) {
			System.out.print(rank_arr[i]+" ");

		}

		System.out.println();


		// 정렬까지 했다면 //

		int c=0;
		int d=0;
		int e=0;
		int over_arr[] = new int[arr.length];
		int ret_arr[] = new int[arr.length];

		for(int i=1; i<=arr.length ; i++) {
			for(int q=0 ; q<arr.length ; q++) {
				if(i==rank_arr[q]) {
					c++;
				}
			}
			if(c==2) {
				over_arr[d] = arr[i-1];
				d++;
				c=0;
			}else {
				ret_arr[e] = arr[i-1];
				e++;
				c=0;
			}
		}


		System.out.println("----------5번-------");   

		for(int i=0; i<=d ; i++) {
			System.out.print(over_arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<=e ; i++) {
			System.out.print(ret_arr[i]+" ");

		
		}
	}
}



