package condition.loop;

import java.util.Scanner;

public class ForEx_07 {

	public static void main(String[] args) {
		
	// ù���� 10���� �����ϰ�,
	// ���������� ������ 2�踦 �����ϴ� �������
    // ����(15��) ���� ������ �ݾ���?

		
		// �ݺ�Ƚ�� : 14��
		// �ݺ����� : 2~15

		// �ʱ�� : n=2
		// ���ǽ� : n<=15
		// ������ : n++
		
		
		// 1. ����
		
		int won=10, sum=10;
		
		
		
		for(int n=2 ; n <= 15 ; n++) {
		
			won *= 2;
			sum += won;
			
		}
		
		System.out.println("������ �ݾ��� : " + sum + "��");
		
		
		
		// �Է��� ���� ����� ��� ���Ͻÿ�(��� = � ���� ������ ����߸��� ��)
			
		System.out.println(" Input Num : ");
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		
		for(int n=2 ; n < 200 ;n++) {
			for(int m=1 ; num % n ==0 ; m++) {  
                int out = m * n;
				System.out.print(out + " ");
			}
			
				
			}
		
		
				
			
		}
		
			
		
		// �ݺ�Ƚ�� :
		// �ݺ����� :

		// �ʱ�� : n=1
		// ���ǽ� : num % 2 >0
		// ������ : n++
			
			
		
	}
	

