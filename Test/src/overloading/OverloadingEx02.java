package overloading;

class Overloading_02{

	private String str;
	//�������� ���ڼ��� ���ؼ� ��ȯ
	// 112233 -> 6
	
	public int getLength(int num) {
		
		String str = String.valueOf(num);
		return str.length();
	}
		
	public int getLength(double num) {
		
		String str = String.valueOf(num);
		return str.length();
		
	}
	
	public int getLength(boolean num) { //alt + shift + r �ش� ����/�ż��� �̸� ����
		
		String str = String.valueOf(num);
		return str.length();
		
	}
		
}
	

