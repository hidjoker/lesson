package array;

public class ArrayEx_05 {

	public static void main(String[] args) {
		
		//���ڿ� �迭
		// String �迭
		// String[]
		
		String[] strArr;
		strArr = new String[3]; // ���ڿ��� 3�� ������ �� �ִ� ����
		
		strArr[0] = "Apple" ;
		strArr[1] = "Banana" ;
		strArr[2] = "Cherry" ;
		
		for( int i=0 ; i < strArr.length ; i++) {  // .length ���ڿ��� ����
			System.out.println(strArr[i]);
			System.out.println("���ڿ� ���� : " + strArr[i].length()); // .length() ���ڿ��� ����
			
			
			
		}
		
		
		
		
		
		
	}
	
	
}

