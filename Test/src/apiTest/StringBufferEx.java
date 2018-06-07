package apiTest;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		System.out.println(str.length()); 
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //스트링버퍼의 기본 저장공간

		System.out.println("---sb2---");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println("len : "+sb2.length()); //5
		System.out.println("cap : "+sb2.capacity()); //16+5 = 21
		System.out.println("sb : "+sb2);	
		
		System.out.println("---sb3---");
		StringBuffer sb3 = new StringBuffer(5);
		System.out.println("len : "+sb3.length()); //0
		System.out.println("cap : "+sb3.capacity()); //5
		System.out.println("sb : "+sb3);
		
		System.out.println("--Apple추가--");
		sb3.append("Apple");
		System.out.println("len : "+sb3.length());
		System.out.println("cap : "+sb3.capacity());
		System.out.println("sb : "+sb3);
		
		System.out.println("--banana추가--");
		sb3.append("Banana");
		System.out.println("len : "+sb3.length());
		System.out.println("cap : "+sb3.capacity()); 
		//Capacity가 넘치게 된 경우 (기존+1)*2 확보
		System.out.println("sb : "+sb3);
		
//		System.out.println("--초과 추가--");
//		sb3.append("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
//		//(기존+1)*2보다 더 필요한 문자열을 추가하는 경우 필요한 만큼 확보
//		System.out.println("len : "+sb3.length());
//		System.out.println("cap : "+sb3.capacity()); 
//		System.out.println("sb : "+sb3);
		
		System.out.println("-----insert()-----");
		// 5번째인덱스(5 offset)에 "Orange" 넣고 출력
		System.out.println("insert : " + sb3.insert(5, "Orange"));
		
		
		System.out.println("-----deleteCharAt()-----");
		// 3번째 인덱스 삭제하고 출력
		System.out.println("deleteCharAt() : "+sb3.deleteCharAt(3));
		
		
		System.out.println("-----delete()-----");
		// delete(0, 3) 호출 후 출력
		System.out.println("delete() : "+sb3.delete(0, 3));
	
		System.out.println("-----substring()-----");
		// substring(1,7) 호출
		;
		System.out.println("substring() : "+sb3.substring(1, 7));
        System.out.println("length : "+sb3.length());
        System.out.println("capacity : "+sb3.capacity());
        System.out.println("sb3 : "+sb3);

		// length, capacity 확인
		// sb출력
		// substring(1,7) 결과 출력
		
		System.out.println("-----trimToSize()-----");
		// trimToSize() 호출
		sb3.trimToSize();
		System.out.println("length : "+sb3.length());
		System.out.println("capacity : "+sb3.capacity());

		// length, capacity 확인

		System.out.println("-----reverse()-----");
		System.out.println(sb3.reverse());
		
		// reverse() 호출 후 결과 확인
		
		
	}
}