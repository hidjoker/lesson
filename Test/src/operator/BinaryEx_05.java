

package operator;

public class BinaryEx_05 {

	public static void main(String[] args) {
		

		// ����Ʈ ������, shift operator
		// <<, >>, >>>
		
		// ���� ����Ʈ, left shift
		// ����Ʈ�� ���ڸ�ŭ�� 2�� �����ؼ� ���Ѵ�		
		int num = 7;
		System.out.println(num << 1);
		System.out.println(num << 2);
		System.out.println(num << 3);
		System.out.println(num << 4);
		System.out.println("-------");


		
		// ���� ����Ʈ, right shift
		// ����Ʈ�� ���ڸ�ŭ�� 2�� �����ؼ� ���Ѵ�		
		num = 7;
		System.out.println(num >> 1);
		System.out.println(num >> 2);
		System.out.println(num >> 3);
		System.out.println(num >> 4);
		
		
		/*
		 * + ����Ʈ ������
		 * - <<
		 * 
		 * ���� ����Ʈ, left shift
		 * ��� ��Ʈ���� ����ƮȽ����ŭ �������� �о��
		 * ���� ������ ��Ʈ�� '0'
		 * ��ġ�� ��Ʈ�� ����
		 *
		 * - >>
		 * 
		 * ������ ����Ʈ, right shift
		 * ��� ��Ʈ���� ���������� �о��
		 * ���� ������ ��Ʈ�� �ֻ��� ��Ʈ�� ���� ��
		 * (��ȣ�� �����Ѵ�)
		 * �з��� ��Ʈ�� ����
		 * 
		 * - >>>
		 * 
		 * ��ȣ���� ������ ����Ʈ, unsigned right shift
		 * ������ ����Ʈ�� ������ ���� ������ ��Ʈ�� ������ '0'
		 * (��ȣ�� �������� �ʴ´�)
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
