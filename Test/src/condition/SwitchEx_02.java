package condition;

public class SwitchEx_02 {

	public static void main(String[] args) {
		
	
	
	
	int num = 2;
	switch(num*10) {
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
	
	
	char ch = 'q';
		
	switch(ch) {
	case 'Q' :
		System.out.println("�빮�� ť");
		break;
	case 113 :
		System.out.println( "�ҹ��� ť");
		break;
	case 'a' : 
		System.out.println("����");
		break;
	case 'B' :
		System.out.println("��");
		break;
		
	}
	
	if(ch == 'Q') {
		
	}else if(ch =='q') {
		
	}else if(ch =='A') {
		
	}else {
		System.out.println("������ ���ھ���");
	}
	
	}	
}
