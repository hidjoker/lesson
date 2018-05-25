package quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		
		int x =5, y=5;
		String key = "start";
		
		Scanner sc = new Scanner(System.in);
		int num1 = 1, num2 = 1 ;
		
		
		while(key != "q") {
			
		
		while(num2 < 11) {
			while(num2 ==1) {
				
				if((x==num1) &&(y==num2)) {
					System.out.println("*");
				}else {
				System.out.print("-");
				num1 += 1;
				 
				if(num1 == 10) {
					 System.out.println();
				     num2 += 1;
				     num1 = 1;
				 }
				}
			}	
			
			while((num2>1)&&(num2<10)) {
				if((x==num1) &&(y==num2)) {
					System.out.println("*");
				}else {
				System.out.println(" ");
				num1 += 1;
			
				if(num1 == 10) {
					 System.out.println();
				     num2 += 1;
				     num1 = 1;
				
			 }
				}
			}
			while(num2==10){
				if((x==num1) &&(y==num2)) {
					System.out.println("*");
				}else {
				System.out.print("-");
				num1 += 1;
				 
				if(num1 == 10) {
					 System.out.println();
				     num2 += 1;
				     num1 = 1;
				 }
			}	
			}
	     
			
			
		
			
	    System.out.println("방향 키를 입력하세요 : ");
		key = sc.nextLine();
		sc.nextLine();
		
		switch(key){
		case "w" :
			y -= 1;			
		
		case "a" :
			x -= 1;
			
		case "d" :
			x += 1;
			
		case "s" :
			y += 1;
			
		}
			
		
		
		
		
		
		}
			
		}
		
		
		
		
		
		
		
	}
	
	
	
}
