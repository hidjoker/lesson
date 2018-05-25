

import java.util.Scanner;

public class quiz_23 {
	
	   public static void main(String[] args) {
	      

	      Scanner sc = new Scanner(System.in);	      
	      
	      System.out.print("Input Number : ");
	      
	      int aa= sc.nextInt();
	  
		   int z=0 , x=0 , c=0 , max=0 ;
	    	  
		   for(int i=1 ;  ; i++) {
			   
			   if(aa % 2 == 1) {
				   
				   if(z==0) {z=i;
				   aa /= 2;
				   continue; }
				   
				   
				   if(x==0) {x=i;
				   aa /= 2;
				   continue; }
				   
				   if(aa==1) {
					   
				   }
				   
				   if(x!=0&&x!=0) {
					   c=x-z;
					   x=z=0;
					   
					  if(max<c) max =c;
					   
				   }
				  }
			   
			   aa /= 2;
					   
		   }

		   System.out.println("Result : "+ max);

	}
}
	




