package condition;

public class SwitchEx_01 {

	public static void main(String[] args) {
		
	
	//
	// switch ��
	// switch - case ��
	//
	
	// switch(����){ // ( ) �ȿ��� �������� �´�, char ����
	// case ��1 :
	// case ��2 :
	// case ��3 :
	// ...
	// default :
	// }
	
	
	int num = 10;
	switch(num) {
	case 10 :
		System.out.println("���� : 10");
		break; //��� �ߴ�
	
	case 20 :
		System.out.println("���� : 20");
	    break; //��� �ߴ�
	    
	case 30 :
		System.out.println("���� : 30");
	    break; //��� �ߴ�
	    
	default :
		System.out.println("����Ʈ, ������ �� ����");
		
	}
	
	
	
}
}