//+ Interface Map
//   - �� ������ ���ҵ� ���� ��������
//   - key, value �� ��(Entry)���� �����͸� ����
//   - key : ���ذ� (�ߺ��Ұ�)
//   - value : �����ϴ� ������(�ߺ�����)
//   - ���࿡ �̹� �����ϴ� key�� �����ϴ� value�� �����ϸ�
//     ������ value�� ���ο� value�� ���������
//   
// + ����, Mapping
//   - ������ �°� ���� ���迡 �ִ� �ٸ� �����ͼ�
//   - �ϴ��� ����
//   - �ϴ�� ����
//   - �ٴ��� ����
//   - �ٴ�� ����
//
// + ����ü
//   - class HashMap
//     Ű �ߺ�X
//     �ߺ��˻�� hashCode()�� ���� equals()�� true�� ��
//     �����ϴٰ� �Ǵ��Ѵ�(����Ű �˻�)
//   - class Hashtable
//     HashMap�� ������ ����ȭó���Ǿ�����
//   - class Properties
//     Hashtable�� ����Ŭ����
//     key, value�� String���� ���ѵǾ�����
//     ��������(�ɼ�����, DB����, �ٱ������� ��)�� ���� �� ���
//     ������ Ȯ���ڰ� .properties�� ���� �о ���


package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionEx_10_Map {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
				
		System.out.println(map);
		System.out.println("--------");
		System.out.println(map.get(3));
		
		System.out.println("--------");
		map.put("D", "Durian");
		System.out.println(map);
		System.out.println(map.get("D"));
		
		System.out.println("--------");
		map.put(2, "Orange"); // Ű �ߺ�
		map.put(4, "Apple"); // �� �ߺ�
		System.out.println(map);
		
		System.out.println("-------");
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("Apple"));
		
		if(!map.containsKey(5)) {
			map.put(5, "Pineapple");
		}
		
		if(map.containsKey("D")) {
			System.out.println(map.get("D"));
		}
		
		if(map.containsKey("555")) { //if���� ����� ����ó��
		String str = (String)map.get(555); //str = null;
		System.out.println(str.length()); //null pointer Exception
		}
		
		System.out.println("------------------");
		System.out.println("size : "+ map.size());
		
		System.out.println("------------------");
		System.out.println("����°�? "+map.isEmpty());
		
        System.out.println("------------------");
        map.remove(3); // Ű�� ã�Ƽ� value�� ����
        System.out.println(map);
        map.remove(2, "Apple");  //Ű�� ã�Ƽ� value�� ��ġ�ϸ� ����
        System.out.println(map);
		
        System.out.println("------------------");
        map.put(10, null); // null���� value������ ���� �� ����
        map.put(null, "Bob"); // null���� key������ ���� �� ����(����)
        System.out.println(map);
        
        
        map.put(null, null); //key�� null�� null ����
        System.out.println(map);
        
        System.out.println("-----------------");
        Set keySet = map.keySet();
        Set entrySet = map.entrySet();
        
        System.out.println("key : "+keySet);
        System.out.println("entry : "+entrySet);
        
	}		
}













