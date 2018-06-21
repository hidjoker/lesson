

package thread_Basic;

class DaemonThreadTest2 implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}

			//주기적으로 반복할 코드
			System.out.println("Auto Save"); 
			
		}
	}
}



public class ThreadEx_08_Daemon {
	public static void main(String[] args) {
		System.out.println("--- Main Start ---");
		
		Thread th = new Thread(new DaemonThreadTest2());
		
		th.setDaemon(true);
		th.start();
		// 주 스레드의 충분한 작업시간
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		
		System.out.println("--- Main End ---");		
	}
}