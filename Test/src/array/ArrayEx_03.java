package array;

public class ArrayEx_03 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		// �迭�� ����, ũ��, ����� ����
		
		System.out.println("�迭�� ���� : "+ arr.length);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	

		
//		arr[5] = 99;
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
//		at array.ArrayEx_03.main(ArrayEx_03.java:17)
//		ArrayIndexOutOfBoundsException - ��Ȳ
//		: 5 - ��ü�� ����
//		at array.ArrayEx_03.main(ArrayEx_03.java:17) - �߻��� ��ġ
		
//		arr[-1] = 88; ArrayIndexOutOfBoundsException
//	    int[] arr2 = new int[-10]; - NegativeArraySizeException
		
		
		
		
	}
	
	
}
