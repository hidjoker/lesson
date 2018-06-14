package exception;

// + ����� ���� ���� �����
// - API�� �����Ǵ� ����Ŭ���� �ܿ� �߰������� �����ϰ� ����
//   ���ܸ� ����� ��
// - Exception Ŭ������ ��ӹ޾� �����Ѵ�



class EvenException extends Exception{

	@Override
	public String getMessage() { // ���� ��Ȳ ����
		return "¦���� �ƴ� ���ڸ� �Է�����";
	}
}

class CheckEven{
	// Ȧ���� �Է��ϸ� ���ܰ� �߻��Ѵ�
	public void check(int num) throws EvenException{//����ó�� ����
		if(num%2 != 0) { //Ȧ��
				throw new EvenException();
			} 	
		System.out.println("¦���Դϴ�!!!");
	}
}

public class ExceptionEx_10_CustumException {
	
	public static void main(String[] args) {
		
		CheckEven ce = new CheckEven();		
	
		try {
			ce.check(13);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
//			System.out.println("Ȧ���� �Է���..");
		}
	}
}
