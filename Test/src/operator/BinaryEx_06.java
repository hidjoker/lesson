

package operator;

public class BinaryEx_06 {

	public static void main(String[] args) {
		
		// ��Ʈ���� ��������
		//    bitwise logical operator
		
		//    &(and) |(or) ^(xor)
		
		int num1 = 21;
		int num2 = 24;
		
		// 21 -> 0001 0101
		// 24 -> 0001 1000
		
		System.out.println(num1 & num2);
		// 16 -> 0001 0000
		
		System.out.println(num1 | num2);
		// 30 -> 0001 1101

		//       0010 0000
		//      -0000 0010
		
		System.out.println(num1 ^ num2);
		
		//XOR(^)       T ^ T =  F  , F ^ T = T
		//(��ȣȭ�� ���)   T ^ F =  T  , F ^ F = F
		
		//      -> 0000 1101
		//  24  -> 0001 1000
		//  21  -> 0001 0101
		
		
		
		
		
		
		    
		
		
		
	
	}
	
	
}
