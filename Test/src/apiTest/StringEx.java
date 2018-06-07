package apiTest;


// + String
// - ���ڿ��� ������ ������ ���ο� ������ �Ҵ��Ѵ�
// - �ܼ� ���ڿ� ���忡 ����
//
// + StringBuffer
// - Ŭ���� ����(����ʵ�)�� ���ڿ� ��������� ����� ����
//  ���ڿ� �����͸� �����Ѵ�
// - ���������� ������ �ʿ��� ���ڿ� ���忡 ����
// - ������ ����� ���ڿ� ������
// - Capacity���� �� ū ���ڿ��� �Ǹ�(���� Capacity+1)*2�δø���
// - (����Capacity+1)*2 ũ�⺸�� ū ���ڿ��� �� ���� length()��ŭ �ø���
//
// ** StringBuilder Ŭ������ StringBuffer�� ������ ������ �Ѵ�
// ** �������� StringBuffer�� ����ȭó���Ǿ��ְ�
//    StringBuilder�� �񵿱�ó���Ǿ��ִ�
//
//
//------------------------������ ����--------------------------
//
// + String Ŭ���� ���ο��� StringBuffer�� Ȱ���ϵ��� ������
// + Ư���� ��찡 �ƴ϶�� �׳� String�� �ᵵ ������



public class StringEx{
	
	public static void main(String[] args) {
		
		String str = "Hello Java";
		// ==> String str = new String("Hello Java");
		
		System.out.println("---length()---");
		System.out.println("str�� ���� : "+str.length());
		
		System.out.println("---toUpperCase()---");
		// ��� �빮�ڷ� ��ȯ�� upperCase�� ���
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		System.out.println("---toLowerCase()---");
		// ��� �ҹ��ڷ� ��ȯ�� lowerCase�� ���
		System.out.println("toLowerCase() :" +str.toLowerCase());
		
		System.out.println("-----charAt()-----");
		// "Hello Java"���� J �� �� char���� ch�� ����,���
		char ch;
		ch=str.charAt(6);
		System.out.println("charAt() : "+ch);
		
		System.out.println("-----concat()-----");
		// str�� ", HIHIHI" ��� ���ڿ� �߰��ϰ� ���
		System.out.println("concat() : " + str.concat(", HIHIHI"));
		
		System.out.println("-----replace()-----");
		// 'l'�� 'X'�� ��ȯ
		System.out.println("replace() : "+str.replace('l', 'X'));
		// "ava"�� "AVA"�� ��ȯ
		System.out.println("replace() : "+str.replace("ava", "AVA"));
		
		System.out.println("-----substring()-----");
		// "Ja" ã�Ƽ� ���
		System.out.println("substring() : "+str.substring(6, 8));
		
		System.out.println("-----contains()-----");
		// str�� "Java"�� �ִ��� �Ǻ�
		System.out.println("contains() : "+str.contains("Java"));
	
		System.out.println("----Trim()----");
		String trim = "    AABASDF   123123     ";
		System.out.println(trim.trim());  //��,�� ���ڿ� ���� ����
		
		System.out.println("---split()---");
		String splitData = "1,2,3,4,5";  //�����ڷ� ©�� ������ �迭������ �־���
		
		String[] splitted = splitData.split(",");
		
		for(String s : splitted) {
			System.out.println(s);
		}
		
		System.out.println("---getBytes()---");
		// String <- CharSequence
		byte[] bytes = str.getBytes();
		
		System.out.println(bytes[0]);
		System.out.println(bytes[1]);
		System.out.println(bytes[2]);
		System.out.println(bytes[3]);
		// ��Ʈ��
		// I/O
		
		// char[]
			
		
	}
	
}		
	
