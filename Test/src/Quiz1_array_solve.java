import java.util.Scanner;

public class Quiz1_array_solve {

	public static void main(String[] args) {
		
	
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		int[] arr2 = new int[6];
		
		// �Է� //
		
		for(int i=0 ; i<(arr.length-1) ; i++) {
			
			System.out.print((i+1)+"���� ��� �ο���? ");
			arr[i] = sc.nextInt();
			arr[5] += arr[i];
		}
		
		
		
		
		for(int i=0 ; i<(arr.length-1) ; i++) {
			
			arr2[i] = arr[i] * 12000; 
			arr2[5] += arr2[i];
		}
		
		
		
		// ��� //
		
		System.out.println("--------------");
		
		for(int i=0 ; i<arr.length-1 ; i++) {
			
			System.out.println((i+1) +"���� �� ������ : " + arr2[i] + "��");
			
		}
		
		System.out.println("�ǹ��� ��� �� �ο��� " + arr[5] + "�� �Դϴ�");
		System.out.println("�������� �� �ݾ��� " + arr2[5] + "�� �Դϴ�");
		
		
		
	
	}
		
		
}
	
	

