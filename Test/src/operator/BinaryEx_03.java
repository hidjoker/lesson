

package operator;

public class BinaryEx_03 {

	public static void main(String[] args) {
		
		// ���� ���� ������
		// ��� ���� ������
		// ���Կ����ڿ� �ٸ� �����ڸ� �����ؼ� ���� ��
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("----���� ��----");
		System.out.println("num1=" +num1+ ",num2="+num2);
		
		num2 += num1;
		// num2 = num2 + num1;
		
		System.out.println("----+���� ��----");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		num2 -= num1;
		// num2 = num2 + num1;
		
		System.out.println("----sub���� ��----");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		
		num2 *= num1;
		// num2 = num2 + num1;
		
		System.out.println("----*���� ��----");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		num1 = 4;
		num2 = 17;
		
		
		System.out.println("----���� ��----");
		System.out.println("num1=" +num1+ ",num2="+num2);
		
		
		num2 /= (double)num1;
		// num2 = num2 + num1;
		
		System.out.println("----/���� ��----");
		System.out.println("num1=" + num1 +",num2=" +num2); //num2�� �ٽ� �����ϹǷ� ������ �����͸� ��Ʈ������ ��ȯ
		
		
		num1 = 22;
		num2 = 11;
		num2 = -num1; // -num1�� num2�� ����
		
		//num2 *= num1;
		//num2 -= num1;
		//num2 /= num1;
		//num2 %= num1; // ��ġ����
		
		System.out.println("----���� ��---");
		System.out.println("num1=" + num1 +",num2=" +num2);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	
	}
		
	
	
	
	
	
	
}
