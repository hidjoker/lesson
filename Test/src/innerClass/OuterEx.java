package innerClass;

//+ ���� Ŭ����, Inner Class
//
//- Ŭ���� ���ο� ���ǵ� �ٸ� Ŭ����
//
//- 4���� ����
//1. ��� ��ø Ŭ����(= Instance Class)
//	: Ŭ������ ����� ���ǵ� ���� Ŭ����
//	  �ν��Ͻ� ������ ���� ����� ���Ѵ�
//	  ��ü���� �� �ܺ�Ŭ������ �ν��Ͻ��� ���� ������ �� �ִ�
//
//2. ���� ��ø Ŭ����(= Static Class)
//	: ��� ��ø Ŭ������ static Ű���带 ���� Ŭ����
//     ���� ����� ���� �� �ְ� �ȴ�
//
//3. ���� ��ø Ŭ����(= Local Inner Class)
//	: �޼ҵ��� ����������(Local Scope, �߰�ȣ ��)���� ���ǵ�
//     Ŭ����
//     �޼ҵ� �������� ����� �� �ִ� Ŭ����
//
//4. �͸� ��ø Ŭ����(= Anonymous Inner Class)
//   : Ŭ���� ���ǿ� ���ÿ� ��ü�� �����ϴ� ���
// 	 ��ü�� �ѹ� ������ �� ���� �ڵ带 ������ �� ����
//    (1ȸ�� Ŭ����)
//    �ַ� �������̽��� �̿��Ͽ� ���� �� ������ �Ѵ�
//    �̺�Ʈ�����ʸ� ������ �� ���Ǵ� �����̴�
//   **�̺�Ʈ������ : �̺�Ʈ�� ���� ������ ������ �ڵ�


public class OuterEx {

	public static void main(String[] args) {
		
		Outer o = new Outer();
		
		System.out.println( o.num );
		System.out.println("-------");
		
		Outer.MemberInner memIn;
		memIn = o.new MemberInner(); //�ν��Ͻ��� ���� ȣ���� �ؾ���
//		memIn = new Outer.MemberInner(); //static���� ȣ�� �Ұ�
		
	    System.out.println(memIn.num);
	    System.out.println("-------");
	    
	    System.out.println(Outer.staticNum);
	    System.out.println(Outer.StaticInner.num);
	    Outer.StaticInner.out();
	    
	    o.out();
	    

		
	}
}
