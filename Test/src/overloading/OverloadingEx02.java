package overloading;

class Overloading_02{

	private String str;
	//데이터의 문자수를 구해서 반환
	// 112233 -> 6
	
	public int getLength(int num) {
		
		String str = String.valueOf(num);
		return str.length();
	}
		
	public int getLength(double num) {
		
		String str = String.valueOf(num);
		return str.length();
		
	}
	
	public int getLength(boolean num) { //alt + shift + r 해당 변수/매서드 이름 변경
		
		String str = String.valueOf(num);
		return str.length();
		
	}
		
}
	

