package collection;

//+ ����, stack
//- LIFO(���Լ���), FILO
//- class Ÿ���̴�
//- �ֿ� �޼ҵ� 
//  push() : ���ÿ� ��ü �߰�
//  pop() : ���ÿ��� ��ü ��ȯ �� ����
//  peek() : ���� ���ʿ� pop()�� ��ü ��ȯ(�������� ����)
//- �޼ҵ� Call stack���� ���Ǵ� �˰���



import java.util.Stack;

public class CollectionEx_12_Stack {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		System.out.println("-----push()-----");
		st.push("Apple");
		st.push("Banana");
		st.push("Cherry");
		System.out.println(st);
		System.out.println("ũ�� : "+st.size());
		
		System.out.println("---pop()-----");
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("ũ�� : "+st.size());
		
		System.out.println("---peek()-----");
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("ũ�� : "+st.size());
		
		
		
		
	}
	
}
