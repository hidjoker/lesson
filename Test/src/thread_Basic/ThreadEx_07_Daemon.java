package thread_Basic;

//+ daemon, 데몬, 데몬 프로그램
//- 상주 프로그램, Resident Program
//- 시스템을 운영할 때 Background 상태로 동작하면서 
//  자동적으로 자신의 기능(서비스)를 수행하는 프로그램
//- ex) 운영체제의 여러 서비스들(서버)
//
//+ 데몬 스레드, Daemon Thread
//- 일반 스레드의 보조 역할로 만들어지는 스레드
//- 주 스레드가 종료되면 같이 종료
//- 일반 스레드에서 setDaemon()을 호출하고 스레드 생성
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

	
	
	
	

