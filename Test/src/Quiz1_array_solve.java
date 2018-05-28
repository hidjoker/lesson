import java.util.Scanner;

public class Quiz1_array_solve {

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		int[] arr2 = new int[6];
		
		// 입력 //
		
		for(int i=0 ; i<(arr.length-1) ; i++) {
			
			System.out.print((i+1)+"층의 사는 인원은? ");
			arr[i] = sc.nextInt();
			arr[5] += arr[i];
		}
		
		
		
		
		for(int i=0 ; i<(arr.length-1) ; i++) {
			
			arr2[i] = arr[i] * 12000; 
			arr2[5] += arr2[i];
		}
		
		
		
		// 출력 //
		
		System.out.println("--------------");
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			
			System.out.println((i+1) +"층의 총 관리비 : " + arr2[i] + "원");
			
		}
		
		System.out.println("건물에 사는 총 인원은 " + arr[5] + "명 입니다");
		System.out.println("관리비의 총 금액은 " + arr2[5] + "원 입니다");
		
		
		
	
	}
		
		
}
	
	

