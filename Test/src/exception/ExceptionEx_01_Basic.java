package exception;


// + ���� �߻� �� üũ����
//  1. ���� Ŭ���� �̸�(�߰������� ���������� ����)
//   ex) java.lang.ArrayIndexOutOfBoundsException
//   �ؼ� : �迭�� �մ����� ���� �ε����� �����Ϸ��� �õ��� �� �߻�
//
//  2. �߻� ����
//   ex) at exception.ExceptionEx_01_Basic.main(ExceptionEx_01_Basic.java:12)
//
//   �ؼ� :  exception ��Ű�� exceptionEx_01_BasicŬ���� main �żҵ忡 
//            ExceptionEx_01_Basic.java ��� ���Ͽ� 12��° ����
//
//  3. ���� �޽���
//   ex) : 3
//   �ؼ� : index 3���� ������ �߻��ߴ�




public class ExceptionEx_01_Basic {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int i = 0;
		
		
		while(true) {
			
			//����ó���ڵ�
			if( i >= arr.length) {
				System.out.println("�ε�����"+arr.length+"���� ũ�� �ȵȴ�");
				break;
			}
			
	
			arr[i] = i+1;
			System.out.println(arr[i]);
			
			i++;			
		}
	
	}

}
