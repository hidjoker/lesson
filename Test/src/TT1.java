import java.util.Scanner;

public class TT1 {

	public static void main(String[] args) {
		
		
		String[] iarrname= {"지훈","현우","영준","진경","영은"};
		int[] iarrage = new int[5];
        int totalage = 0;
        int maxage = 0;
        int maxindex = 0;
        int minage = 0;
        int minindex = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0 ; i < iarrname.length ; i++) {
        	
        	System.out.print(iarrname[i] + "의 나이를 입력하세요 : ");
        	
        	iarrage[i] = sc.nextInt();
        	totalage += iarrage[i];
        	
            }
        
        
        System.out.println("학생들의 평균 나이는 : " +(totalage / (double)iarrname.length));
        
				
		for(int i=0 ; i < iarrname.length ; i++) {
			
			if(iarrage[i]>maxage) {
				maxage = iarrage[i];
				maxindex = i;
				
		      }
			
		}
		
		System.out.println("가장 나이가 많은 사람은 : " + iarrname[maxindex] + " ["+iarrage[maxindex]+"]");
		
		minage = totalage;
		for(int i=0 ; i < iarrname.length ; i++) {
			
			if(iarrage[i]<minage) {
				minage = iarrage[i];
				minindex = i;
				
			}
			
		}
		
		System.out.println("가장 나이가 적은 사람은 : " + iarrname[minindex] + " ["+iarrage[minindex]+"]");
		
		
		
		
		
		
				
		
	}
}
