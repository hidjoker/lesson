package condition.loop;

import java.util.Scanner;

public class EtcEx_01 {

	public static void main(String[] args) {
	
	
		//  labeled break
		//       ���̺� �극��ũ
		
		Apple : //���̺�
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j=0 ; j<10 ; j++) {

				if( j == 5 ) break Apple ; //���̺� �극��ũ
				
				System.out.println(i + " : " + j);
			}
		}
		
		
		
		}
		
		
	}		
	