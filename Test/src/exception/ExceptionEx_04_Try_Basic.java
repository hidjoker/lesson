package exception;

import java.util.Scanner;

public class ExceptionEx_04_Try_Basic {
	
	public static void main(String[] args) {
		
		
//		+ ���� ó�� ����, Exception Handling
//		 - try - catch ����

		
		try {
			// try ���
			// ���ܰ� �߻��Ǵ� �ڵ�
			// ���� �߻��� �����Ǵ� �ڵ�
		
		} catch (ArithmeticException e) {
			// Arithmetic���� ó�� �ڵ�
		} catch (NullPointerException e) {
			// NullPointerException���� ó�� �ڵ�
		} catch (Exception e) {
			// ���� catch�� ������ ������ ���� ó�� �ڵ�
		} finally {
			// ���ܹ߻��ص� ����
			// ���ܹ߻����� �ʾƵ� ����
			// �ַ� �ڿ� ���� �ڵ�� ��
		}
//		Scanner sc = new Scanner(System.in);
//		sc.close(); // Ű���� �Է¸޸� �ڿ����� �ڵ�(���� �����ʾƵ� �ڵ������� �����)
		
		System.out.println("����ó������ ��");
		
	}

}
