package generics;

// + ���׸� �����ϱ�
//  - <T extends �θ�Ŭ����>
//  - TŸ���� �θ�Ŭ������ ����Ŭ����Ÿ�����θ� ������ �� �ִ�
//  - �������̽��� ���������� ������


public class GenericsEx_08_Extends {
	
	public static void main(String[] args) {
			
		print(123); //static �޼ҵ�� ���� �Ҵ� ������ ���
		print(345.345);
//		print("Apple"); //StringŸ�� ����~!
		
	
	}

	public static<T extends Number> void print(T t1) {
    // T Ÿ���� NumberŸ���� �ڽ�Ŭ���� Ÿ�Ը� ���(Long,Double,Integer ��..)
		
		System.out.println("--------");
		System.out.println(t1);
		
	}

}
