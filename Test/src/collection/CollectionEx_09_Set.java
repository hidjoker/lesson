package collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionEx_09_Set {
	
	public static void main(String[] args) {
		
//		Set set = new TreeSet(); // TreeSet 고유의 매소드를 사용할 수 없다
		TreeSet tree = new TreeSet();
		
		tree.add("Banana");
		tree.add("Cherry");
		tree.add("Durian");
		tree.add("Apple");
		
		System.out.println(tree); //아스키코드값대로 정렬
		System.out.println("-----------"); 
		
		Set head = tree.headSet("Cherry"); //문자열 아스키코드값이 더 작은 것들을 탐색
		System.out.println(head);
		
		System.out.println("-----------");
		Set tail = tree.tailSet("Cherry"); //자신 포함한 아스키코드값이 더 큰 것을 탐색
		System.out.println(tail);
		
		System.out.println("-----------");
		Set sub = tree.subSet("Banana", "Cherry");
		System.out.println(sub);
		
		
	}		
}
		















