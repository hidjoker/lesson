

package operator;

public class BinaryEx_04 {

	public static void main(String[] args) {
		

		// ��������
		// ����(true/false)�� ���� ����� ��ȯ�ϴ� ������
		// ������ ���踦 ������ ����
		// AND(&&), OR(||), XOR(�ڹٿ� ����), NOT(!)
		
		
		boolean b1 = true;
		boolean b2 = false;
		
		// System.out.println("AND : " + b1 && b2);  //���� �߻�
		                                        // �켱���� +������ > &&������ 
		                                        // =>  AND : true && false
		System.out.println("AND : " + (b1 && b2)); //��ȣ�� ������ 
		System.out.println("OR : " + (b1||b2));
		
		//�������� �� ���� : ���� ������ ����� ������ �� ���
		
		int num = 57;
		System.out.println((num>=1) && (num<=100));
		// 1. num�� 1���� ũ�ų� ������?
		// 2. num�� 100���� �۰ų� ������?
		
		// 1. 2. �� ���ÿ� �����ϴ°�?
		
		// -> num�� 1~100�� �����ΰ�
		
		// 1<= num <=100 �̷��� �ȵ� => true <= 100 ���� �߻�
		
		System.out.println( !((num>=1) && (num<=100)));
		
		System.out.println( (num<1) || (num>100));
		
		
		
	
	}
	
	
}
