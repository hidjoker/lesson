

import java.util.Scanner;

public class quiz_study2_1 {
	
	   public static void main(String[] args) {
	      

	      Scanner sc = new Scanner(System.in);	      
	      
	      System.out.print("Input Number : ");
	      
	      int aa= sc.nextInt();
	  
		   int z=0 , x=0 , c=0 , max=0 ;
	    	  
		   for(int i=1 ; aa!=1 ; i++) {
			   
			   if(aa % 2 == 1) {
				   
				   if(z==0) {
					   z=i;
				   }else if(x==0){
					   x=i;
					   c=x-z-1;
					   z=x;
					   x=0;
				   }
				   if(max<c) max =c; 
			   }
	
			   aa /= 2;
			   
			   if(aa==1) {
				   if(z==0) {
					   z = i+1;
				   }else if(x==0){
					   x=i+1;
					   c=x-z-1;
					   z=x;
					   x=0;
				   }
				   
				   if(max<c) max =c; 

			   }
					   
		   }
		   
		   
		   System.out.println("Result : "+ max);

	}
}
	




