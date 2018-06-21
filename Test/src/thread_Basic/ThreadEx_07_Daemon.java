package thread_Basic;

//+ daemon, ����, ���� ���α׷�
//- ���� ���α׷�, Resident Program
//- �ý����� ��� �� Background ���·� �����ϸ鼭 
//  �ڵ������� �ڽ��� ���(����)�� �����ϴ� ���α׷�
//- ex) �ü���� ���� ���񽺵�(����)
//
//+ ���� ������, Daemon Thread
//- �Ϲ� �������� ���� ���ҷ� ��������� ������
//- �� �����尡 ����Ǹ� ���� ����
//- �Ϲ� �����忡�� setDaemon()�� ȣ���ϰ� ������ ����
//- ex) Garbage Collector


class DaemonThreadTest implements Runnable{
	@Override
	public void run() {
		for(int i=0 ; i<100 ; i++) {
			System.out.println(i+"HI");
		}
	}
}




public class ThreadEx_07_Daemon {
	public static void main(String[] args) {
		System.out.println("--- Main Start ---");
		DaemonThreadTest dt = new DaemonThreadTest();
		
		Thread th = new Thread(dt);
		
		th.setDaemon(true);
		
		th.start();
		
//		try {
//			th.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
				
		System.out.println("--- Main End ---");
		
		
	}
	
	
	
	
}

	
	
	
	

