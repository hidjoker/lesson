package ClassBasic;

import classMethod.Method_03;

public class MethodEx_03 {
	
	public static void main(String[] args) {
	
		
		Method_03 m03 = new Method_03();
		
		int[] arr = {1,2,3,4,5};
		
		m03.mul10(arr); //�迭�� ��� ��� 10��
		
		m03.print(arr); //�迭�� ��� ��� ���
		
		

     // arr = {6,7,8,9,10}; // �����Ҷ� ������ ����, �̹� ���� �� �Ұ���
		int[] arr2 = {6,7,8,9,10};
		
		// ���� �迭�� �״�� �ΰ�
		// ���ο� �迭�� ��ȯ�Ѵ�
		// ���ο� �迭�� �����迭�� ��� ��Ҹ� 10���� �Ͱ� ����
		
		int[] result = m03.mul10_v2(arr2);
		
		m03.print(arr2);
		m03.print(result);
		
		
		
		
		
		
	}

}
