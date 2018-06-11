package collection;

//+interface Set
//- 셋(집합)
//- 데이터의 순서를 유지하지 않음
//- 인덱스 없음
//- 중복 데이터 허용하지 않음(객체 해시코드 기준)
//
//+ 구현체
//- class HashSet
//  다른 Set에 비해 접근이 빠른 편
//- class LinkedHashSet
//  순서를 유지하는 Set
//- class TreeSet
//  정렬기능이 있는 Set, 오름차순 정렬, 
//  Set 생성작업이 느린 편 (데이터 추가도 느림)
//
//
//+ HashSet과 TreeSet의 차이
//
//- HashSet은 Hash알고리즘(Hashing)을 이용하여 구현
//- TreeSet은 BST(이진 탐색트리)를 이용하여 구현
//- HashSet이 탐색이 빠름(탐색용,저장용)
//- TreeSet은 HashSet보다 느림
//- TreeSet은 정렬기능이 있다



import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionEx_05_Set {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add(11);
		set.add(33);
		set.add(22);
		
		System.out.println(set); //입력순서와 무관하게 데이터 저장
		System.out.println("크기 : "+set.size());
		System.out.println("비었는가? : "+set.isEmpty());
		System.out.println("22가 있는가? : "+set.contains(22));
		System.out.println("33제거 : " +set.remove(33)); //return 타입 boolean
		System.out.println("55제거 : " +set.remove(55));
		System.out.println(set);
		
		System.out.println("-------");
//		set.clear(); //set 전부 삭제
//		System.out.println("비었는가? " + set.isEmpty());
//		System.out.println(set);

		List list = Arrays.asList(11,22,33,44,55);
		set.removeAll(list); // 차집합 removeAll(collection)
		System.out.println(set);
		
		
		
		
		
		
		}
		
}














