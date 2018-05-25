package condition.loop;


public class WhileEx_04 {

	public static void main(String[] args) {
	
        int score = 88;
        char grade;
        
        switch(score / 10) {
        case 10:
        case 9 :
        	grade = 'A';
        	break;
        	
        case 8 :
        	grade = 'B';
        	break;
        }
        
        if( score >= 90 && score <=100) grade = 'A';
        else if( score>=70 && score <=80) grade = 'B';
                
    	
        	
        }


		
		
	}	
