package thread_Basic;

//+ ��Ƽ ������, Multi - Thread
//- ���α׷� : ��������
//- ���μ��� : �������� ���α׷�
//           �޸𸮿� ������·� �ε�� ���α׷�
//- ������ : ���μ����� �۾�����(�������)
//
//+ ��Ƽ ������ ���α׷�
//   �����带 ���� �� �ٷ�� ���α׷�
//   ( <-> �̱� ������ ���α׷� )
//
//- ���� ������, Main Thread, �� ������
//   ���μ����� �⺻�� �Ǵ� ������
//
//- ��Ƽ ������ Ŭ����
//     interface Runnable
//        run() �޼ҵ带 ����� ����
//        run() �� ������ȭ�� �� �ִ� �޼ҵ�
//        Runnable�� ��ӹ޾Ƽ� run() �������ϸ�
//        ������ȭ �Ǵ� �ڵ带 ������ �� �ִ�
//     class Thread
//        interface Runnable�� ����ϰ� ����
//        start() �޼ҵ带 ����� ����
//        start() �޼ҵ�� run() �޼ҵ带 ������ȭ��Ŵ
//        sleep() ���� �޼ҵ嵵 ����� ����
//        sleep() �޼ҵ�� �����带 �Ű������� ������ �и��ʸ�ŭ �Ͻ����� ��Ŵ



class ThreadTest01 extends Thread{
	@Override
	public void run() {
	
		for(int i=0 ; i<100 ; i++) {
			System.out.println("ThreadTest : "+i);		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}


public class ThreadEx_01_classThread {

	public static void main(String[] args) {
		
		ThreadTest01 tt = new ThreadTest01();
		ThreadTest01 tt2 = new ThreadTest01();

		tt.start(); //������ ����
		tt2.start();
		
//		tt.run(); //�Ϲ� �޼ҵ� ȣ��
		
		for(int i=0 ; i<100 ; i++) {
			System.out.println("Main : "+i);
	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
		}
		
		
	}
	
}
