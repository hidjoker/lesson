package thread_Basic;

import java.util.Random;

public class ThreadEx_04_Join extends Thread{

	private int idx; //스레드 인덱스
	
	public ThreadEx_04_Join(int i) {idx=i;}
	
	
	@Override
	public void run() {
		System.out.println(idx+" 스레드 시작");
		
		Random ran = new Random();
		try {
			Thread.sleep(ran.nextInt(3000));
		} catch (InterruptedException e) {}
		
		System.out.println(idx+" 스레드 종료");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Main 스레드 시작");
		
		ThreadEx_04_Join t1 = new ThreadEx_04_Join(1);
		ThreadEx_04_Join t2 = new ThreadEx_04_Join(2);
		ThreadEx_04_Join t3 = new ThreadEx_04_Join(3);
		
		t1.start();
		t2.start();
		t3.start();

		try {
			// 메인 메소드가 다른 스레드의 종료 기다리기(동기화 작업)
			t1.join(); 
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main 스레드 종료");
		
		
	}
	
}
