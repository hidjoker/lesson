import java.util.Scanner;

public class TT1 {

	public static void main(String[] args) {
		
		
		String[] iarrname= {"����","����","����","����","����"};
		int[] iarrage = new int[5];
        int totalage = 0;
        int maxage = 0;
        int maxindex = 0;
        int minage = 0;
        int minindex = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0 ; i < iarrname.length ; i++) {
        	
        	System.out.print(iarrname[i] + "�� ���̸� �Է��ϼ��� : ");
        	
        	iarrage[i] = sc.nextInt();
        	totalage += iarrage[i];
        	
            }
        
        
        System.out.println("�л����� ��� ���̴� : " +(totalage / (double)iarrname.length));
        
				
		for(int i=0 ; i < iarrname.length ; i++) {
			
			if(iarrage[i]>maxage) {
				maxage = iarrage[i];
				maxindex = i;
				
		      }
			
		}
		
		System.out.println("���� ���̰� ���� ����� : " + iarrname[maxindex] + " ["+iarrage[maxindex]+"]");
		
		minage = totalage;
		for(int i=0 ; i < iarrname.length ; i++) {
			
			if(iarrage[i]<minage) {
				minage = iarrage[i];
				minindex = i;
				
			}
			
		}
		
		System.out.println("���� ���̰� ���� ����� : " + iarrname[minindex] + " ["+iarrage[minindex]+"]");
		
		
		
		
		
		
				
		
	}
}
