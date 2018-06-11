package collection;

//+ interface List
//- 리스트
//- 데이터를 일렬로 배치하는 자료구조
//- 1차원 구조
//- 선형 구조
//- 요소를 인덱스로 관리
//- 리스트에 요소가 추가될 때 자동으로 인덱스가 부여된다
//- 데이터의 순서를 유지한다
//
//
//+ List의 구현체(Class)
//
//- class ArrayList
//	배열과 같은 동작
//	배열과 달리 공간 확장 가능
//	다른 List에 비해 빠른 편
//	단방향 포인터
//
//- class LinkedList
//       양방향 포인터
//
//
//- class Vector
//	ArrayList와 동작이 같음
//	동기화처리되어있음
//	capacity 사용


import java.util.ArrayList;
import java.util.List;

public class CollectionEx_01_List {
	public static void main(String[] args) {
		
		// 탐색(조회), 삽입/추가, 삭제, 수정
		
		List list;
		list = new ArrayList();
		
		System.out.println("---삽입---");
		list.add("Apple"); // 삽입
		list.add("Banana");
		list.add("Cherry");
		System.out.println(list);
		
		System.out.println("\n---삭제(2)---");
		list.remove(2); // 삭제
		System.out.println(list);
	
		System.out.println("\n---조회(1)---");
		System.out.println( list.get(1) );
		
		System.out.println("\n---삽입---");
		list.add(1, "Tomato");
		System.out.println(list);
		
		System.out.println("\n---contains()---");
		System.out.println( list.contains("Tomato") );
		
		System.out.println("\n---isEmpty()---");
		System.out.println( list.isEmpty() );
		
		System.out.println("\n---clear()---");
		list.clear();
		System.out.println(list);
		
		System.out.println("\n----------");
		list.add("A");
		list.add("B");
		list.add("C");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
		System.out.println("--------");
		for(Object s : list) {
			System.out.println(s);
		}
		
		
		System.out.println("--------");
		list.add(100);
		list.add(true);
		list.add(123.456);
		System.out.println(list);
	}
}














