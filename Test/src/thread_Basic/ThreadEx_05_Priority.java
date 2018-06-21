package thread_Basic;

import java.util.Random;

public class ThreadEx_05_Priority extends Thread{

	private int idx; //������ �ε���
	
	public ThreadEx_05_Priority(int i) {idx=i;}
	
	
	@Override
	public void run() {
//		System.out.println(idx+" ������ ����");
		
		for(int i=0 ; i<100 ; i++) {
			System.out.print(idx);
		}
		
//		System.out.println(idx+" ������ ����");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main ������ ����");
		
		ThreadEx_05_Priority t1 = new ThreadEx_05_Priority(1);
		ThreadEx_05_Priority t2 = new ThreadEx_05_Priority(2);
		ThreadEx_05_Priority t3 = new ThreadEx_05_Priority(3);
		
		// �켱 ���� ����
		t1.setPriority(Thread.MIN_PRIORITY); // Thread.MIN_PRIORITY, 1
		t2.setPriority(5); // Thread.NORM_PRIORITY, 5
		t3.setPriority(10); // Thread.MAX_PRIORITY, 10
		
		t1.start();
		t2.start();
		t3.start();

		try {
			// ���� �޼ҵ尡 �ٸ� �������� ���� ��ٸ���(����ȭ �۾�)
			t1.join(); 
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main ������ ����");
		
		
	}
	
}
