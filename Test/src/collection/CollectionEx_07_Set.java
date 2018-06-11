package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class CollectionEx_07_Set {
	
	public static void main(String[] args) {
		
	
		Set set = new HashSet();
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		System.out.println(set);
		
		System.out.println("----------");
		Iterator iter = set.iterator(); //1.인덱스가 없기 때문에 Iterator로 접근하여 사용한다
		while(iter.hasNext()) {
			System.out.println(iter.next());	
		}
		
		System.out.println("----------");
		Object[] arr = set.toArray(); //2.배열에 담아 인덱스를 사용하는 방법
		
		Arrays.sort(arr); //sort매소드로 오름차순 정렬
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		

		
		}
		
}














