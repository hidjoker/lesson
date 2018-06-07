package apiTest;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		System.out.println(str.length()); 
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //��Ʈ�������� �⺻ �������

		System.out.println("---sb2---");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("len : "+sb2.length()); //5
		System.out.println("cap : "+sb2.capacity()); //16+5 = 21
		System.out.println("sb : "+sb2);	
		
		System.out.println("---sb3---");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println("len : "+sb3.length()); //0
		System.out.println("cap : "+sb3.capacity()); //5
		System.out.println("sb : "+sb3);
		
		System.out.println("--Apple�߰�--");
		sb3.append("Apple");
		System.out.println("len : "+sb3.length());
		System.out.println("cap : "+sb3.capacity());
		System.out.println("sb : "+sb3);
		
		System.out.println("--banana�߰�--");
		sb3.append("Banana");
		System.out.println("len : "+sb3.length());
		System.out.println("cap : "+sb3.capacity()); 
		//Capacity�� ��ġ�� �� ��� (����+1)*2 Ȯ��
		System.out.println("sb : "+sb3);
		
//		System.out.println("--�ʰ� �߰�--");
//		sb3.append("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//		//(����+1)*2���� �� �ʿ��� ���ڿ��� �߰��ϴ� ��� �ʿ��� ��ŭ Ȯ��
//		System.out.println("len : "+sb3.length());
//		System.out.println("cap : "+sb3.capacity()); 
//		System.out.println("sb : "+sb3);
		
		System.out.println("-----insert()-----");
		// 5��°�ε���(5 offset)�� "Orange" �ְ� ���
		System.out.println("insert : " + sb3.insert(5, "Orange"));
		
		
		System.out.println("-----deleteCharAt()-----");
		// 3��° �ε��� �����ϰ� ���
		System.out.println("deleteCharAt() : "+sb3.deleteCharAt(3));
		
		
		System.out.println("-----delete()-----");
		// delete(0, 3) ȣ�� �� ���
		System.out.println("delete() : "+sb3.delete(0, 3));
	
		System.out.println("-----substring()-----");
		// substring(1,7) ȣ��
		;
		System.out.println("substring() : "+sb3.substring(1, 7));
        System.out.println("length : "+sb3.length());
        System.out.println("capacity : "+sb3.capacity());
        System.out.println("sb3 : "+sb3);

		// length, capacity Ȯ��
		// sb���
		// substring(1,7) ��� ���
		
		System.out.println("-----trimToSize()-----");
		// trimToSize() ȣ��
		sb3.trimToSize();
		System.out.println("length : "+sb3.length());
		System.out.println("capacity : "+sb3.capacity());

		// length, capacity Ȯ��

		System.out.println("-----reverse()-----");
		System.out.println(sb3.reverse());
		
		// reverse() ȣ�� �� ��� Ȯ��
		
		
	}
}