package thread_Basic;

//+ 멀티 스레드, Multi - Thread
//- 프로그램 : 실행파일
//- 프로세스 : 실행중인 프로그램
//           메모리에 실행상태로 로드된 프로그램
//- 스레드 : 프로세스의 작업단위(실행단위)
//
//+ 멀티 스레드 프로그램
//   스레드를 여러 개 다루는 프로그램
//   ( <-> 싱글 스레드 프로그램 )
//
//- 메인 스레드, Main Thread, 주 스레드
//   프로세스의 기본이 되는 스레드
//
//- 멀티 스레딩 클래스
//     interface Runnable
//        run() 메소드를 멤버로 가짐
//        run() 는 스레드화될 수 있는 메소드
//        Runnable을 상속받아서 run() 재정의하면
//        스레드화 되는 코드를 구현할 수 있다
//     class Thread
//        interface Runnable을 상속하고 있음
//        start() 메소드를 멤버로 가짐
//        start() 메소드는 run() 메소드를 스레드화시킴
//        sleep() 정적 메소드도 멤버로 가짐
//        sleep() 메소드는 스레드를 매개변수로 전달한 밀리초만큼 일시정지 시킴



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

		
		tt.start(); //스레드 실행
		tt2.start();
		
//		tt.run(); //일반 메소드 호출
		
		for(int i=0 ; i<100 ; i++) {
			System.out.println("Main : "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			
		}
		
		
		
	}
	
}
