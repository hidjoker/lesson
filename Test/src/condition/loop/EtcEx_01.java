package condition.loop;

import java.util.Scanner;

public class EtcEx_01 {

	public static void main(String[] args) {
	
	
		//  labeled break
		//       레이블 브레이크
		
		Apple : //레이블
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j=0 ; j<10 ; j++) {

				if( j == 5 ) break Apple ; //레이블 브레이크
				
				System.out.println(i + " : " + j);
			}
		}
		
		
		
		}
		
		
	}		
	