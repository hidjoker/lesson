import java.util.Scanner;

public class TT2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("dan ют╥б : ");
		int a= sc.nextInt();
		
	
		gugudan(a);
		
		
		
				
		
	}
	public static void gugudan(int r){
		
		
		for(int j=1 ; j<10 ; j++) {
			System.out.println(r+ "*" + j + "=" + (r*j));
		}
		
		
	}
}
