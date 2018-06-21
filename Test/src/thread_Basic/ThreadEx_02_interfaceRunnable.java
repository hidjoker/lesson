package thread_Basic;

//+ ������ ����ȭ, Thread Synchronization
//- ���� �����尡 �ϳ��� ���� �ڿ��� �����Ϸ��� �õ��ϴ� �ܿ�
//  ���ÿ� �����ϴ� ��Ȳ�� �������� ó��
//- �ѹ��� �ϳ��� �����常 �۾��� �� �ֵ��� �ڿ��� Lock�� �Ǵ�
//- Lock�� �ɷ��ִ� �ڿ��� �ٸ� �����尡 ������ �� ����
//- �������� �۾��� �Ϸ�Ǹ� Lock�� Ǯ���ش�
//
//+ �Ӱ迵��, Critical Section
//- ����ȭ ����
//- �ٸ� ��������� ���ÿ� �����ϴ� ���� ���� ����
//- Lock�� �ɸ��� ����
//- synchronized Ű���带 ����ؼ� �����ϴ� ����
//
//+ ����ȭ ����
//- ����ȭ �޼ҵ�
//    [����������] synchronized [����Ÿ��] �޼ҵ��(�Ű�����){ }
//
//- ����ȭ ���
//   synchronized(��ü) {
//   }
//  ex)
//   // ����ȭ �޼ҵ�
//    public synchronized void out1( Object o) {
//    }
//   // ����ȭ ���
//    public void out2(Object o){
//    synchronized( o ){
//      }
//    }
//    // ����ȭ ���
//    @Override
//    public void run() {
//       synchoronized( this ) {
//       }
//     }
//
//+ �Ӱ迵��(����ȭ����) LOCK ���� ���� �޼ҵ�
//- wait() : LOCK �ݳ�, notify ��ȣ ������ ��ٸ� 
//- notify() : ��� ������ ������ �����忡 ����(�Ӱ迵��Ȱ��ȭ�˸�)
//- notifyAll() : ��� ������ ��� �����忡 ����
//
//+ ����ȭ ���ǻ���
//- ������, Fairness
//  ��� �����尡 �ڿ��� ���� ���� ��ȸ�� �����ϰ� �޾ƾ��Ѵ�
//- ��ƻ���, Starvation
//  �ڿ��� ���� ���� ��ȸ�� ���� ���ϴ� �������� ����
//- ��������, Dead Lock
//  ��������� ���� ������ ������� �ڿ��� �ʿ�� �ϴµ� ���� �ڿ��� �ݳ����� �ʴ� ��Ȳ




class ThreadTest02 implements Runnable{
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


public class ThreadEx_02_interfaceRunnable {

	public static void main(String[] args) {
		
		ThreadTest02 tt = new ThreadTest02();
		
		Thread thread = new Thread(tt);
		thread.start();
		
		for(int i=0 ; i<100 ; i++) {
			System.out.println("Main : "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
		}
		
		
		
	}
	
}
