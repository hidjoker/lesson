import java.util.Random;
import java.util.Scanner;

public class up_down_game {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int com = ran.nextInt(50)+1;
		
		Scanner sc = new Scanner(System.in);
		
		int user;
		
		for(int i=1 ; i<8 ; i++) {
			System.out.print("["+i+"ȸ] Input Number(1~50) : ");
			user = sc.nextInt();
			
			if(user==com) {
				System.out.println("����!");
				return; 
			}
			if(user<com) {
				System.out.println("UP!");
				
			}
			if(user>com) {
				System.out.println("DOWN!");
			}
		}
		
		System.out.println("����! 7�� �Ѱ���ϴ�");
						
			
		}
	
		
		
		
		
	}
	
	

