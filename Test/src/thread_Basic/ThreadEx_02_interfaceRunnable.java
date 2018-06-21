package thread_Basic;

//+ 스레드 동기화, Thread Synchronization
//- 여러 스레드가 하나의 같은 자원에 접근하려고 시도하는 겨우
//  동시에 접근하는 상황을 막기위한 처리
//- 한번에 하나의 스레드만 작업할 수 있도록 자원에 Lock을 건다
//- Lock이 걸려있는 자원은 다른 스레드가 접근할 수 없다
//- 스레드의 작업이 완료되면 Lock을 풀어준다
//
//+ 임계영역, Critical Section
//- 동기화 영역
//- 다른 스레드들이 동시에 접근하는 것을 막은 영역
//- Lock이 걸리는 영역
//- synchronized 키워드를 사용해서 적용하는 영역
//
//+ 동기화 영역
//- 동기화 메소드
//    [접근제한자] synchronized [리턴타입] 메소드명(매개변수){ }
//
//- 동기화 블록
//   synchronized(객체) {
//   }
//  ex)
//   // 동기화 메소드
//    public synchronized void out1( Object o) {
//    }
//   // 동기화 블록
//    public void out2(Object o){
//    synchronized( o ){
//      }
//    }
//    // 동기화 블록
//    @Override
//    public void run() {
//       synchoronized( this ) {
//       }
//     }
//
//+ 임계영역(동기화영역) LOCK 상태 통지 메소드
//- wait() : LOCK 반납, notify 신호 통지를 기다림 
//- notify() : 대기 상태의 임의의 스레드에 통지(임계영역활성화알림)
//- notifyAll() : 대기 상태의 모든 스레드에 통지
//
//+ 동기화 주의사항
//- 공정성, Fairness
//  모든 스레드가 자원에 대한 접근 기회를 공정하게 받아야한다
//- 기아상태, Starvation
//  자원에 대한 접근 기회를 얻지 못하는 스레드의 상태
//- 교착상태, Dead Lock
//  스레드들이 서로 상대방이 사용중인 자원을 필요로 하는데 서로 자원을 반납하지 않는 상황




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
