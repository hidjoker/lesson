package manage;

public class ForEach {
	
	public static void main(String[] args) {
		
		//for each
		// �迭�� ��� ��Ҹ� �ѹ��� �����ϱ� ���ϰ� ���ִ� �ݺ���
		
		// for each loop
		
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
//		�Ϲ� for loop
		
//		for(int i=0 ; i<arr.length ; i++) {
//			System.out.println(arr[i]);
//		}
		
		//for( �迭���Ÿ�� ������ : �迭��) {
		// 
		// �迭�� ��� ��Ҹ� ������ �ѹ��� ��� �ڵ� �ݺ�
		// 
		//
		// }
		
		
		
		for(int num : arr) {
			num +=100;  // num �������� for�� ����� ����� (Call by Value - ���������� ������ ����)
		}
		
		System.out.println("--------------------");
		
		for(int num : arr) {
			System.out.println(num);
		}
	
		
	}

}
