//+ Interface Map
//   - 두 집합의 원소들 간의 대응관계
//   - key, value 의 쌍(Entry)으로 데이터를 관리
//   - key : 기준값 (중복불가)
//   - value : 대응하는 데이터(중복가능)
//   - 만약에 이미 존재하는 key에 대응하는 value를 삽입하면
//     기존의 value가 새로운 value로 덮어씌워진다
//   
// + 매핑, Mapping
//   - 데이터 셋과 대응 관계에 있는 다른 데이터셋
//   - 일대일 매핑
//   - 일대다 매핑
//   - 다대일 매핑
//   - 다대다 매핑
//
// + 구현체
//   - class HashMap
//     키 중복X
//     중복검사는 hashCode()가 같고 equals()가 true일 때
//     동일하다고 판단한다(동일키 검사)
//   - class Hashtable
//     HashMap과 같지만 동기화처리되어있음
//   - class Properties
//     Hashtable의 하위클래스
//     key, value가 String으로 제한되어있음
//     설정정보(옵션정보, DB정보, 다국어정보 등)을 읽을 때 사용
//     파일의 확장자가 .properties인 것을 읽어서 사용


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
		map.put(2, "Orange"); // 키 중복
		map.put(4, "Apple"); // 값 중복
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
		
		if(map.containsKey("555")) { //if문을 사용한 예외처리
		String str = (String)map.get(555); //str = null;
		System.out.println(str.length()); //null pointer Exception
		}
		
		System.out.println("------------------");
		System.out.println("size : "+ map.size());
		
		System.out.println("------------------");
		System.out.println("비었는가? "+map.isEmpty());
		
        System.out.println("------------------");
        map.remove(3); // 키값 찾아서 value를 지움
        System.out.println(map);
        map.remove(2, "Apple");  //키값 찾아서 value가 일치하면 지움
        System.out.println(map);
		
        System.out.println("------------------");
        map.put(10, null); // null값을 value값으로 정할 수 있음
        map.put(null, "Bob"); // null값을 key값으로 정할 수 있음(비추)
        System.out.println(map);
        
        
        map.put(null, null); //key값 null에 null 대입
        System.out.println(map);
        
        System.out.println("-----------------");
        Set keySet = map.keySet();
        Set entrySet = map.entrySet();
        
        System.out.println("key : "+keySet);
        System.out.println("entry : "+entrySet);
        
	}		
}













