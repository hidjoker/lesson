package exception;

public class ExceptionEx_06_throw {
	
	public static void main(String[] args) {
		
		// ���� �߻���Ű��
//		throw new NullPointerException();
		
		
//		 + ���� �߻���Ű��
//		  - throw new ����Ŭ����(); 
//		   (Exception e = new Exception();)
//		   (throw e;)
//		 
//		   (throw new NullPointException();)
//		  - Ư����Ȳ�� �����ڰ� ���� ���ܸ� �߻���ų �� ���
		
//		 + ���� ���ѱ��, ����ó�� �̷��
//		  - throws ����Ŭ���� :
//		     [����������] [����Ÿ��] �޼ҵ��(�Ű�����) [throws ����Ŭ����]{
//		     }
//		  - throws�� ����� �޼ҵ带 ȣ���Ϸ��� �ݵ�� ���ܸ� ó���ؾ��Ѵ�
//		   (����ó���� ���� ������ ���������� ����)
//
//		 + ���� ó�� ���
//		   1. throws �����ϱ�
//		   2. try - catch���� �����ϱ�


		
		try {
			throw new NullPointerException();
		}catch(NullPointerException e) {
			System.out.println("�������� ���� ���� �߻�");
		}catch(Exception e) {
			System.out.println("��� ���� ó��");
		}finally {
			System.out.println("������ ����Ǵ� �ڵ�");
		}
		
		System.out.println(" + + ���α׷� ���� ���� + +");
		
	}
}
