package exception;

public class ExceptionEx_02_Try_Basic {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
		  for(int i=0 ; true ; i++) {
		     arr[i] = i+1;   // �����߻�! ���α׷��ߴ�
			 System.out.println(arr[i]);
		  }
		}catch(Exception e) { // Exception(�θ�Ŭ����Ÿ��) e = ArrayIndexOutOfBoundException
//		  e.printStackTrace(); // printStackTrace() ���� �޼��� ��� �޼ҵ�
		  System.out.println("+ + + �ε��� ��� + + +");
		}
		System.out.println("���α׷� ����");
	}

}
