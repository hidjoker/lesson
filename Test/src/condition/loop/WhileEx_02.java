package condition.loop;

public class WhileEx_02 {

	public static void main(String[] args) {
		
// while 문 이용
// 1번. 0~9까지 출력
// 2번. Hello 6번 출력하기
// 3번. 5 4 3 2 1 0 으로 출력하기
		
		
		// 1번 //
		
		
		int n=0;
		while(n<10) {
           
			System.out.print(n + " ");
			
			n++;
		}
		
		System.out.println();
		
		// 2번 //
		n=0;
		while(n<6) {
			
			System.out.println("Hello");
			n++;
		}
		
			
		
		// 3번 //
		
		n=5;
		while(n>=0) {
			
			System.out.print(n + " ");
			
			n--;
		}
		
			
		}
		
	
	//반복횟수 : 6
	//반복구간 : 5 -> 0
	
	//초기식 : i = 5;
	//조건식 :
	//증감식 : i --;
	
		
				
	}
	
