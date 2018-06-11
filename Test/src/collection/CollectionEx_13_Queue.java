package collection;

//+ 큐, Queue
//- FIFO(선입선출), LILO
//- interface로 되어있음
//- class LinkedList를 이용하면 된다
//   ex) Queue q = new LinkedList();
//
//- 주요 메소드
//  offer() : 큐에 객체 추가(enqueue, 인큐)
//  poll() : 큐에서 객체 반환 및 제거(dequeue, 데크)
//  peek() : 큐에서 객체 반환(제거 X)

import java.util.LinkedList;
import java.util.Queue;

public class CollectionEx_13_Queue {

	public static void main(String[] args) {
		
		Queue queue = new LinkedList();
		System.out.println("---offer()-----");
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue);
		System.out.println("크기 : "+queue.size());
		
		System.out.println("---poll()------");
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("크기 : "+queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("크기 : "+queue.size());
		
		System.out.println("---peek()-----");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("크기 : "+queue.size());
		
		
		
	}
	
}
