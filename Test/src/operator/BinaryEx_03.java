

package operator;

public class BinaryEx_03 {

	public static void main(String[] args) {
		
		// 복합 대입 연산자
		// 산술 대입 연산자
		// 대입연산자와 다른 연산자를 조합해서 쓰는 것
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("----연산 전----");
		System.out.println("num1=" +num1+ ",num2="+num2);
		
		num2 += num1;
		// num2 = num2 + num1;
		
		System.out.println("----+연산 후----");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		num2 -= num1;
		// num2 = num2 + num1;
		
		System.out.println("----sub연산 후----");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		
		num2 *= num1;
		// num2 = num2 + num1;
		
		System.out.println("----*연산 후----");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		num1 = 4;
		num2 = 17;
		
		
		System.out.println("----연산 전----");
		System.out.println("num1=" +num1+ ",num2="+num2);
		
		
		num2 /= (double)num1;
		// num2 = num2 + num1;
		
		System.out.println("----/연산 후----");
		System.out.println("num1=" + num1 +",num2=" +num2); //num2에 다시 대입하므로 더블형 데이터를 인트형으로 변환
		
		
		num1 = 22;
		num2 = 11;
		num2 = -num1; // -num1을 num2에 대입
		
		//num2 *= num1;
		//num2 -= num1;
		//num2 /= num1;
		//num2 %= num1; // 배치주의
		
		System.out.println("----연산 후---");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	
	}
		
	
	
	
	
	
	
}
