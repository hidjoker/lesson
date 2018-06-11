package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx_02_List {
	public static void main(String[] args) {

//		+ArrayList vs LinkedList
//		 - ArrayList 단방향포인터, 순차 검색이 빠르다
//		 - LinkedList 양방향포인터, 추가, 삭제가 용이하다 
//		 - 데이터를 저장하고 수정할 일이 많지 않으면 ArrayList
//		 - 추가 삭제가 빈번할 경우 LinkedList

		
		
		List list1 = new ArrayList();
		List<String> list2 = new ArrayList<>(); // <>앞에만 한정해줘도 됨(자바 1.8v)
		List<Integer> list3 = new ArrayList<Integer>();
		//<>제네릭 : 데이트 타입 한정해줌
		
		
//		list2.add(123);
		list2.add("Orange");
		
//		list3.add(545.333);
		list3.add(666);
		
		
		System.out.println("----------");
		// ... : 가변인자, 가변파라미터, 갯수가 정해지지않은 인자 
		List intList = Arrays.asList(1,2,3,4,5);
		System.out.println(intList);
		
		List stringList
			= Arrays.asList("Alice","Bob","Clare");
		System.out.println(stringList);
		
	}
}














