

import java.util.Scanner;

public class quiz_study1 {

	public static void main(String[] args) {
		
		int x=5, y=5;
		String key = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(key!="q") {
			
			// ���� ��� //
			
		for(int i=1 ; i<=10 ; i++) {

			for(int q=1 ; q<=10 ; q++) {
				
				if(x==q&&y==i) {
					
					System.out.print("*");
				
				}else if(i==1||i==10) {
					
					System.out.print("=");
					
				}else {
					
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		// ���� Ű �Է�  //
		
		System.out.print("���� Ű�� �Է��ϼ���(w,a,s,d // ����q) :");
		key = sc.nextLine();
		
		switch(key) {
		
		case "w" :		  
			y--;
			if(y<1){
				System.out.println("�� �̻� ������ �� �����ϴ�");
			y++;
			}
			break;
			
		case "s" :			
			y++;
			if(y>10){
				System.out.println("�� �̻� ������ �� �����ϴ�");
			y--;
			}
			break;
			
		case "a" :
			x--;
			if(x<1){
				System.out.println("�� �̻� ������ �� �����ϴ�");
			x++;
			}
			break;
			
		case "d" :
			x++;
			if(x>10){
				System.out.println("�� �̻� ������ �� �����ϴ�");
			x--;
			}
			break;
			
		case "q" :
			System.out.println("Good bye");
			
			default : 
				System.out.println("Ű�� �߸� �����̽��ϴ�.");
		}
		
			
			
		
		
		
		
		}
		
		
		
		
	}
	
	
	
}
