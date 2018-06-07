package apiTest;


// + String
// - 문자열을 저장할 때마다 새로운 공간을 할당한다
// - 단순 문자열 저장에 좋음
//
// + StringBuffer
// - 클래스 내부(멤버필드)로 문자열 저장공간을 만들어 놓고
//  문자열 데이터를 관리한다
// - 지속적으로 관리가 필요한 문자열 저장에 좋음
// - 편집이 빈번한 문자열 관리용
// - Capacity보다 더 큰 문자열이 되면(기존 Capacity+1)*2로늘린다
// - (기존Capacity+1)*2 크기보다 큰 문자열이 될 때는 length()만큼 늘린다
//
// ** StringBuilder 클래스는 StringBuffer와 동일한 동작을 한다
// ** 차이점은 StringBuffer는 동기화처리되어있고
//    StringBuilder는 비동기처리되어있다
//
//
//------------------------현재의 동작--------------------------
//
// + String 클래스 내부에서 StringBuffer를 활용하도록 수정됨
// + 특수한 경우가 아니라면 그냥 String을 써도 무관함



public class StringEx{
	
	public static void main(String[] args) {
		
		String str = "Hello Java";
		// ==> String str = new String("Hello Java");
		
		System.out.println("---length()---");
		System.out.println("str의 길이 : "+str.length());
		
		System.out.println("---toUpperCase()---");
		// 모두 대문자로 변환한 upperCase를 출력
		System.out.println("toUpperCase() : " + str.toUpperCase());
		
		System.out.println("---toLowerCase()---");
		// 모두 소문자로 변환한 lowerCase를 출력
		System.out.println("toLowerCase() :" +str.toLowerCase());
		
		System.out.println("-----charAt()-----");
		// "Hello Java"에서 J 값 얻어서 char변수 ch에 저장,출력
		char ch;
		ch=str.charAt(6);
		System.out.println("charAt() : "+ch);
		
		System.out.println("-----concat()-----");
		// str에 ", HIHIHI" 라는 문자열 추가하고 출력
		System.out.println("concat() : " + str.concat(", HIHIHI"));
		
		System.out.println("-----replace()-----");
		// 'l'을 'X'로 변환
		System.out.println("replace() : "+str.replace('l', 'X'));
		// "ava"를 "AVA"로 변환
		System.out.println("replace() : "+str.replace("ava", "AVA"));
		
		System.out.println("-----substring()-----");
		// "Ja" 찾아서 출력
		System.out.println("substring() : "+str.substring(6, 8));
		
		System.out.println("-----contains()-----");
		// str에 "Java"가 있는지 판별
		System.out.println("contains() : "+str.contains("Java"));
	
		System.out.println("----Trim()----");
		String trim = "    AABASDF   123123     ";
		System.out.println(trim.trim());  //앞,뒤 문자열 공백 제거
		
		System.out.println("---split()---");
		String splitData = "1,2,3,4,5";  //구분자로 짤라서 값들을 배열값으로 넣어줌
		
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
		// 스트림
		// I/O
		
		// char[]
			
		
	}
	
}		
	
