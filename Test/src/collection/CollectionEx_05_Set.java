package collection;

//+interface Set
//- ��(����)
//- �������� ������ �������� ����
//- �ε��� ����
//- �ߺ� ������ ������� ����(��ü �ؽ��ڵ� ����)
//
//+ ����ü
//- class HashSet
//  �ٸ� Set�� ���� ������ ���� ��
//- class LinkedHashSet
//  ������ �����ϴ� Set
//- class TreeSet
//  ���ı���� �ִ� Set, �������� ����, 
//  Set �����۾��� ���� �� (������ �߰��� ����)
//
//
//+ HashSet�� TreeSet�� ����
//
//- HashSet�� Hash�˰���(Hashing)�� �̿��Ͽ� ����
//- TreeSet�� BST(���� Ž��Ʈ��)�� �̿��Ͽ� ����
//- HashSet�� Ž���� ����(Ž����,�����)
//- TreeSet�� HashSet���� ����
//- TreeSet�� ���ı���� �ִ�



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
		
		System.out.println(set); //�Է¼����� �����ϰ� ������ ����
		System.out.println("ũ�� : "+set.size());
		System.out.println("����°�? : "+set.isEmpty());
		System.out.println("22�� �ִ°�? : "+set.contains(22));
		System.out.println("33���� : " +set.remove(33)); //return Ÿ�� boolean
		System.out.println("55���� : " +set.remove(55));
		System.out.println(set);
		
		System.out.println("-------");
//		set.clear(); //set ���� ����
//		System.out.println("����°�? " + set.isEmpty());
//		System.out.println(set);

		List list = Arrays.asList(11,22,33,44,55);
		set.removeAll(list); // ������ removeAll(collection)
		System.out.println(set);
		
		
		
		
		
		
		}
		
}














