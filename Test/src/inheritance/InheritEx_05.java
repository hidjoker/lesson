package inheritance;

class Parent05{
	public void display() {
		System.out.println("�θ�Ŭ����");	
	}
	
}

class Child05 extends Parent05{ //Ŭ���� final - �� �̻� Ŭ���� ��� ����
	@Override
	public void display() { //final -  �޼ҵ� �������̵� ����
		System.out.println("�ڽ�Ŭ����");		
	}

}

class GrandChild05 extends Child05{
	
	public void display() {
		
	}
	
}
	

public class InheritEx_05 {
	public static void main(String[] args) {
		Parent05 p = new Parent05();
	
	}
}

//  + final Ű����
//
//  - �� �̻� Ȯ���� �� ������ �����ϴ� Ű����
//
//  - ����
//
//     �� �ѹ��� ���� �ʱ�ȭ�� �� �ְ� ����
//     ������ ���ȭ��Ŵ
//  ex) public final int MAX; //���� 1ȸ �ʱ�ȭ�� �� ���� �Ұ�
//
//  - �޼ҵ�
//  
//    �� �̻� �������̵��� �� ������ ����
//  ex) public final void out(){
//     // �ڽ�Ŭ�������� �� �̻� ������ �Ұ�
//     }
//
//  - Ŭ����
//
//  �� �̻� �ڽ�Ŭ������ ������ �� ������ ����
//  ex) public final class Data{
//     // �ڽ�Ŭ������ ���� �� ����
//     // ����� �� �� ���� ������



