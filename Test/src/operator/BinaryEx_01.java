


 /*
  * + ����, Operation
  * - ���
  * - ���α׷����� �����͸� �����ϴ� ��
  * - �ϳ� �̻��� ������(operator)�� �ǿ�����(operand)�� ����
  *   ex) 1 + 3
  *   ex) +3
  *   
  *     
  * + ������, Operator
  *  - ������ ������ ��Ÿ���� ��ȣ
  *  
  * + ������ �з� ���
  *   1. ��ɿ� ���� �з�
  *    ���, ����, ��, ����, ��Ÿ
  *         
  *   2. �ǿ����� ������ ���� �з�
  *    ����, ����, ����
  *      
  *
  * 
  *    
  */

package operator;

public class BinaryEx_01 {

	public static void main(String[] args) {
		//���������
		
		int num1 = 17;
		int num2 = 4;
				
		
		// int result = 17 + 4;
		// int result = 21;
		
		
		//** ���Կ����� = 
		//** ������ ���� ���� ���� ���� ������ �����Ѵ�
		
		
		int result = num1 + num2;
		System.out.println("��� : " + result);
		
		
		System.out.println("--------");
		System.out.println(num1 + num2); //add(����)
		System.out.println(num1 - num2); //sub(����)
		System.out.println(num1 * num2); //mul(���ϱ�)
		System.out.println(num1 / num2); //div(������)
		System.out.println(num1 % num2); //mod(������)

		System.out.println("--------");
		System.out.println(num1 / (double)num2); //�Ҽ�
		                                                // 17 / (double)4 
		                                                // 17.0(�ڵ� ����ȯ) / 4.0 (��������ȯ)
		                                                // 4.2500000
		                                                // (double)num1 / num2 = (double)num1 / (double)num2 = 4.2500000
		
		
		System.out.println((double)num1 / num2);
		System.out.println("-----");
		// double �������� ������ ����
		System.out.println(num1%(double)2);
		System.out.println(num1%2.4);
		
		System.out.println("----���ܻ���----");
		// System.out.println( 11 / 0);
		//= java.lang.ArithmeticException: / by zero at operator.BinaryEx_01.main(BinaryEx_01.java:75)
        System.out.println(12.34 / 0); //= Infinity
        
        
		
		
		
		
	
		
	}
	
	
	
	
	
	
}
