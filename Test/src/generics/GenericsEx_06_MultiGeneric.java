package generics;


class Class06<T1, T2>{
	
	private T1 data1;
	private T2 data2;
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	
	public<K1, K2> K2 change(K1 data) { //형변환 메소드
		K2 result = (K2) data;
		return result;
	}
	
}
	
	



public class GenericsEx_06_MultiGeneric {
	public static void main(String[] args) {
		
		Class06<Integer, String> c06 = new Class06<>();
		c06.setData1(111);
		c06.setData2("Apple");
		
		Integer data = 100;
//		c06.change(data); // 타입이 결정되지 않으면 Object형 타입
		Double res = c06.change(data); // double형 변수에 넣어 double형 데이터 타입으로 결정됨
		
//		Integer d1 = 100;          // Integer는 Wrapper 클래스이며 데이터 타입이 참조형이기 떄문에 자동형변환이 되지 않는다
//		Double d2 = (Double)d1;    // 오토 언박싱이 되지 않기 때문에 강제 형변환을 해줘야 에러가 발생하지 않는다
//		
//		int d3 = 100;
//		double d4 = (double)d3;   //기본타입에선 자동형변환이 된다
		
	}
}
