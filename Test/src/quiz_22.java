

import java.util.Scanner;

public class quiz_22 {
	
	   public static void main(String[] args) {
	      

	      Scanner sc = new Scanner(System.in);	      
	      
	      System.out.println("Input Number : ");
	      
	      int A= sc.nextInt();
	      
	      int result = solution(A);

	      System.out.println("Result : " + result);
	      
	   }
	   
	   
	   
	   public static int solution(int N) {

		   int aa = N;
		   int answer;
		   int z=0 , x=0 , c=0 , max=0 ;
	    	  
		   for(int i=1 ; aa!=1 ; i++) {
			   
			   if(aa % 2 == 1) {
				   
				   if(z==0) z=i;
				   if(x==0) x=i;
				   
				   if(x!=0&&x!=0) {
					   c=x-z;
					   x=z=0;
					   if(max<c) max =c;
					   
				   }
				  }
			   
			   aa /= 2;
					   
		   }
	      
		   answer = max;
		   
	      return answer; 
	   }
	}
	




