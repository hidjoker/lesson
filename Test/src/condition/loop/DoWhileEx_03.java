package condition.loop;

import java.util.Scanner;

public class DoWhileEx_03 {

	public static void main(String[] args) {
	
		int select; // 메뉴선택
	    Scanner sc = new Scanner(System.in);
		
      do {
    	  System.out.println("=======================");
    	  System.out.println("\t M   e   n   u");
    	  System.out.println("=======================");
    	  System.out.println("\t1. Hello World 출력");
    	  System.out.println("\t2. 이름 출력");
    	  System.out.println("\t3. 성별 출력");
    	  System.out.println("\t4. 종료");
    	  System.out.println("=======================");
    	  
    	  //메뉴 선택 입력받기
    	  System.out.print("\n >> ");
    	  select = sc.nextInt();
    	  
    	  switch(select) {
    	  case 1 : //Hello World
    		  System.out.println("Hello World");
    		  break;
    	  case 2 : //이름
    		  System.out.println("이현우");
    		  break;
    	  case 3 : //성별
    		  System.out.println("남자");
    		  break;
    	  case 4 : //종료
    		  System.out.println("Good Bye");
    		  break;
    		  
    		default : //잘못된 선택
    			System.out.println("잘못된 메뉴 입니다");
    	     }
    	  }
      while(select!=4); //while end
    	  
  		
	
  }	//main end
}


// + 제어문, Control Statement
// - 조건문 if문
//        else if
//        else

// - 반복문 for 문
// - 반복문 while 문
// - 반복문 do-while 문
