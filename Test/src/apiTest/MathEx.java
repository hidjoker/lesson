package apiTest;

// + Math Ŭ����
//
// - ����(���) ���� ���� �޼ҵ带 �����ϴ� Ŭ����
// - �ַ� ��������� �̷���� ������ ������ ���� ����� ������
// - ex)
// // �Ҽ��� ù°�ڸ� �ݿø�
// Math.round(11.234);
// ->11 


public class MathEx {
	public static void main(String[] args) {
		
		// -10�� ���밪
		System.out.println("-10�� ���밪 : "+Math.abs(-10));
		// 3.7�� �ø���
		System.out.println("3.7�� �ø��� : "+Math.ceil(3.7));
		// 3.7�� ������
		System.out.println("3.7�� ������ : "+Math.floor(3.7));
		// 2.1�� 3������
		System.out.println("2.1�� 3������ : "+Math.pow(2.1,3));
		// 0.0(����) ~ 1.0(����) ������ ����(����)
		System.out.println("0.0~1.0������ ���� : "+Math.random());
		// �ڿ���� e�� 3.3����
		System.out.println("e�� 3.3���� : "+ Math.pow(Math.E,3.3));
		// -3.7�� �ø���
		System.out.println("-3.7�� �ø��� : "+Math.ceil(-3.7));
		// -3.7�� ������
		System.out.println("-3.7�� ������ : "+Math.floor(-3.7));
	
	}
	
}
