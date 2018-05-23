

package operator;

public class BinaryEx_05 {

	public static void main(String[] args) {
		

		// 시프트 연산자, shift operator
		// <<, >>, >>>
		
		// 왼쪽 시프트, left shift
		// 시프트한 숫자만큼의 2를 제곱해서 곱한다		
		int num = 7;
		System.out.println(num << 1);
		System.out.println(num << 2);
		System.out.println(num << 3);
		System.out.println(num << 4);
		System.out.println("-------");


		
		// 왼쪽 시프트, right shift
		// 시프트한 숫자만큼의 2를 제곱해서 곱한다		
		num = 7;
		System.out.println(num >> 1);
		System.out.println(num >> 2);
		System.out.println(num >> 3);
		System.out.println(num >> 4);
		
		
		/*
		 * + 시프트 연산자
		 * - <<
		 * 
		 * 왼쪽 시프트, left shift
		 * 모든 비트열을 시프트횟수만큼 왼쪽으로 밀어낸다
		 * 새로 들어오는 비트는 '0'
		 * 넘치는 비트는 삭제
		 *
		 * - >>
		 * 
		 * 오른쪽 시프트, right shift
		 * 모든 비트열을 오른쪽으로 밀어낸다
		 * 새로 들어오는 비트는 최상위 비트와 같은 값
		 * (부호를 유지한다)
		 * 밀려난 비트는 삭제
		 * 
		 * - >>>
		 * 
		 * 부호없는 오른쪽 시프트, unsigned right shift
		 * 오른쪽 시프트와 같지만 새로 들어오는 비트가 무조건 '0'
		 * (부호를 유지하지 않는다)
		 * 
		 * 
		 */
		
		System.out.println("--------");
		num = -23;
		System.out.println(num>>2);		
		num = -23;
		System.out.println(num>>>2);
		
		
		
		
	
	}
	
	
}
