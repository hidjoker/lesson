package interfaceEx;

interface InterA{
	public void getA();
}

interface InterB{
	public void getB();
}

interface InterC extends InterA, InterB { //인터페이스간의 상속은 다중상속이 가능
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
		c.getA(); //ctrl+클릭 유용~ 상단메뉴 <- 돌아가기
		c.getB(); // ctrl + 좌,우 => 작업내용 이전 이후
		c.getC(); // ctrl + shift + - 축소 // ctrl + shift + [ 화면분할
	}
}
