package condition.loop;

import java.util.Scanner;

public class DoWhileEx_02 {

	public static void main(String[] args) {
	
    
		Scanner sc = new Scanner(System.in);
		
		// 99�� �Է��� �� ������  �ݺ� �Է�
		
//		int num = sc.nextInt();
//		while( num != 99) {
//			num = sc.nextInt();
//			System.out.println(num);
//		}
		
		
		int num;
		do {
			num = sc.nextInt();
			System.out.println(num);
		}while(num != 99);
		
		
		
				
		
	}
}	
