package thread_Synchronized;

class SyncTest02 extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		synchronized(this) {
		for(int i=1 ; i<=100 ; i++) {
			System.out.println(i+ "의 값을 더하기");
			total += i;
		   }
		
//		notify(); //LOCK 반납(임계영역 해제)  main 다시 run
		}
		System.out.println("자동 임계영역 해제");

	}
}


public class WaitNotifyEx_02 {
	public static void main(String[] args) {
		
		SyncTest02 st = new SyncTest02();
		st.start();
		synchronized(st) {
			try {
				System.out.println("waiting 중");
				st.wait(); // LOCK 반납(임계영역 해제)
				System.out.println("waiting 끝");
			} catch (InterruptedException e) {}
			
			System.out.println("1~100의 합 : "+st.total);
		}
		

	}	
}
