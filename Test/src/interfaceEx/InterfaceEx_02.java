package interfaceEx;

interface InterA{
	public void getA();
}

interface InterB{
	public void getB();
}

interface InterC extends InterA, InterB { //�������̽����� ����� ���߻���� ����
	public void getC();
}

class Child implements InterC{ // == implements InterA, InterB, InterC
	@Override
	public void getA() {
	}
	@Override
	public void getB() {
	}
	@Override
	public void getC() {
	}
	
}

public class InterfaceEx_02{
	public static void main(String[] args) {
		Child c = new Child();
		c.getA(); //ctrl+Ŭ�� ����~ ��ܸ޴� <- ���ư���
		c.getB(); // ctrl + ��,�� => �۾����� ���� ����
		c.getC(); // ctrl + shift + - ��� // ctrl + shift + [ ȭ�����
	}
}
