import java.util.Scanner;

public class Quiz_condition_loop {

	public static void main(String[] args) {
		
		
		//1 �� //
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		
		for(int i=1; i<10 ; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
			
		}
		
		//2�� //
		
		System.out.print("Input Number1 : ");
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		
		int m = num1 * num2;
		int v;
		int res1=0, res2=0;
		
		for(int i=2 ; i<num1 ||i<num2 ; i++) {
			if(m % i ==0) {
				
				v = m / i;
				
				if( v % i ==0) {
					
					v= v / i;
					
					if(v % i > 0) {
						
					res1 = i;
					res2 = num1 * num2 / i;					
				
			         }
				}
			}
			
			if(res1>1) break;
	   }
	
		if(res1==0 && res2==0) {
		   System.out.println("�ִ����� : 1, �ּҰ���� : " + (num1 * num2));
		}else {
		   System.out.println("�ִ����� : "+res1 +" , �ּҰ���� : " + res2 );
		}
				
		
		
		//3�� //
		
		System.out.print("Input Number : ");
		num = sc.nextInt();
		int k=0;
		for(int i=1 ; i <=num ; i++) {
			if(num % i ==0) {
				System.out.print(i+" ");
				k++;
			}
			if(k == 6) {
				System.out.println();
				k=0;
			}
			
			}
			
		
		// 4�� //
		
		int sum=0;
		
		for(int i=1 ; i <=1000 ; i++) {
			if(i % 4 == 1) {
				if(i % 6 ==1) {
				sum += i;
				}
			}
			
		}
		System.out.println();
		System.out.println("1~1000���� �������� 1�� ���� �� : " + sum);
		
		
		// 5�� //
		
		System.out.print("Input Number : ");
		num = sc.nextInt();
		int bb=0;
	
		
		for(int i=2 ; i<=num ; i++) {
	
			int aa=1;
			
			
			for(int o=2 ; o<i ; o++) {
			
				if(i % o == 0 ) {
					aa=0; 
					break;
					}
			}
			
			if(aa==1) {
				System.out.print(i + " ");
				bb++;
			}
		  	if(bb==6) {
		  		System.out.println();
					bb=0;
			}
		}
		

		
}
}
		
		
	
	
	
	

