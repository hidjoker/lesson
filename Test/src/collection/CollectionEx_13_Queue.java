package collection;

//+ ť, Queue
//- FIFO(���Լ���), LILO
//- interface�� �Ǿ�����
//- class LinkedList�� �̿��ϸ� �ȴ�
//   ex) Queue q = new LinkedList();
//
//- �ֿ� �޼ҵ�
//  offer() : ť�� ��ü �߰�(enqueue, ��ť)
//  poll() : ť���� ��ü ��ȯ �� ����(dequeue, ��ũ)
//  peek() : ť���� ��ü ��ȯ(���� X)

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
		System.out.println("ũ�� : "+queue.size());
		
		System.out.println("---poll()------");
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("ũ�� : "+queue.size());
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("ũ�� : "+queue.size());
		
		System.out.println("---peek()-----");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println("ũ�� : "+queue.size());
		
		
		
	}
	
}