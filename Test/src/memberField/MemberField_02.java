package memberField;

public class MemberField_02 {

     
	// Ŭ���� ����, ���� ����, static ����
	private static String city = "Seoul";
	
	// Ŭ���� ������ Getter
	
	public static String getCity() {
		
		return city;
		
	}
		
	// Ŭ���� ������ Setter
	public static void setCity(String city) { // static ->Ŭ���� �żҵ�

		MemberField_02.city = city;  //this : �ڱ� ���� ����=�ν��Ͻ�  static(����) �ȿ��� ��� �ȵ�
		 			
	}
	
	
	
	
	
	
	
}
