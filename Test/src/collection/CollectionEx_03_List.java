package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionEx_03_List {
	public static void main(String[] args) {

		// �ݺ���, Iterator
		//	�÷����� ��ҵ��� �о���� ����� ǥ��ȭ�� ��
		
		List list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Durian");
		
		Iterator iter;
		iter = list.iterator();
		
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
	}
}













