package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx_02_List {
	public static void main(String[] args) {

		List list1 = new ArrayList();
		List<String> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<Integer>();
		
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














