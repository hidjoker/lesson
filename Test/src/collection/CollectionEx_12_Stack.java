package collection;

//+ 스택, stack
//- LIFO(후입선출), FILO
//- class 타입이다
//- 주요 메소드 
//  push() : 스택에 객체 추가
//  pop() : 스택에서 객체 반환 및 제거
//  peek() : 다음 차례에 pop()할 객체 반환(제거하지 않음)
//- 메소드 Call stack으로 사용되는 알고리즘



import java.util.Stack;

public class CollectionEx_12_Stack {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		System.out.println("-----push()-----");
		st.push("Apple");
		st.push("Banana");
		st.push("Cherry");
		System.out.println(st);
		System.out.println("크기 : "+st.size());
		
		System.out.println("---pop()-----");
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("크기 : "+st.size());
		
		System.out.println("---peek()-----");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("크기 : "+st.size());
		
		
		
		
	}
	
}
