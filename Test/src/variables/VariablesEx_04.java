package variables;

public class VariablesEx_04 {
	
	public static void main(String[] args) {
		
		// �Ǽ��� ������
		System.out.println(123); // int �� ����
		System.out.println(3.14); // double �� ����
		System.out.println(3.14f); // float �� ����
		
		
		// float = 3.14 ; ����! float�� ������ double�� �ڷḦ �Է��� �� ����
		
		//�ذ��
		
		float f = (float) 3.14 ; // 3.14 ������ �����͸� float�� �����ͷ� ��ȯ�ؼ� ����
		double d = 3.14; // ������ ������ ����
		float f1 = 3.14f; // �÷�Ʈ�� �����ͷ� ����
		
		// double d = 3.14f ; ����! double�� ������ float�� �ڷḦ �Է��� �� ����
		
		//�ذ�� ���� ���� �������
		
		double d1 = (double) 3.14f;
		
		
		/*
		 * ������ �� ��ȯ(Type Casting)
		 * - �������� ���� Ÿ���� �����͸� ������ �� �ִ�.
		 * - ������ �ٸ� Ÿ���� �����͸� �����Ϸ��� ����ȯ�� �ʿ��ϴ�.
		 * - ���� ����ȯ(����� ����ȯ)
		 *    ǥ�� ������ ū �����͸� ���� ������ ������ �� 
		 *    
		 *    ex) int num = (int) 3.14; // num���� 3���� ����ȴ�
		 *    
		 * - �ڵ� ����ȯ(������ ����ȯ)
		 *    ǥ�� ������ ���� �����͸� ū ������ ������ ��
		 *    
		 *    double d = 100;  // 100.0���� ����
		 *    
		 *    - ����
		 *    12 + 34.56 // int + double (x)
		 *    12.0 + 34.56 // double + double (��)
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}

}
