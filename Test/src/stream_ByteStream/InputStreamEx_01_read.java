package stream_ByteStream;

// + �����, Input / Output, I/O
//  - ���α׷��� �Է���ġ, �����ġ�� ������ ��/������ �ϴ� ��
//
// + ��Ʈ��, Stream
//  - ���, �帧
//  - SW���� ��ġ
//  - ����� ��ġ�� ���α׷��� �����͸� ��ȯ�� �� �ֵ��� �����Ǵ� ���
//  - System.in , System.out
//  - �ܹ���
//  - FIFO ������ �̷�����ִ�(Queue)
//  - ����Ʈ������ �����Ѵ�
//  - ���۸� ������ �ִ�
//  ** ����, Buffer
//     ��Ʈ�� �ȿ� ���ԵǾ������� I/O ��ġ�� ���α׷� ����
//    ó���ӵ� ���̸� ���̱� ���� ���ȴ�
//
//  + ��Ʈ�� �з�
//  - �Է� ��Ʈ�� : �Է� ��ġ�� ����� ��Ʈ��
//  - ��� ��Ʈ�� : ��� ��ġ�� ����� ��Ʈ��
//  - 1�� ��Ʈ�� : ����� ��ġ�� ���� ����Ǵ� ��Ʈ��
//  - 2�� ��Ʈ�� : 1�� ��Ʈ���� ����Ǵ� ��Ʈ��
//  - ����Ʈ ��Ʈ�� : ����Ʈ(1B) ������ ������ϴ� ��Ʈ�� 
//  - ���� ��Ʈ�� : ����(char, 2B) ������ ������ϴ� ��Ʈ��
//  - ���� ��Ʈ�� : �������� ����� ����� ������ �ٸ� ��Ʈ���� ����� ����ų �� �ֵ��� 
//                   �����ִ� ��Ʈ��(ex 2�� ��Ʈ��)



// + InputStream�� �ֿ� �޼ҵ�
// - int read() throws IOException
//     �Է½�Ʈ������ 1Byte�� �о���δ�
//     ���� �������� ASCII�� int������ ��ȯ
// - int read(byte[] b) throws IOException
//     �Է½�Ʈ������ b�迭�� �ִ� ũ�⸸ŭ �о���δ�
//     ���� �����͸� b�迭�� ó������ ����Ѵ�
//     ���� �������� ���̸� int������ ��ȯ�Ѵ�
// - int read(byte[] b, int off, int len) throws IOException
//     �Է½�Ʈ������ len��ŭ �о���δ�
//     ���� �����͸� b�迭�� off �ε������� ����Ѵ�
//     ���� �������� ���̸� int������ ��ȯ�Ѵ�




import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx_01_read {
	public static void main(String[] args) {
		
	   
		InputStream is;
		is = System.in; //System.in �ڹ� ǥ�� �Է½�Ʈ��(Ű����� ����)
		
		StringBuffer sb = new StringBuffer();
		
		int in;
		System.out.println("�Է´����...");
		
		try {
			while((in = is.read())!= -1) { //�Է¹����� ������ ������ -1�� ��ȯ ex) ABC = 65 66 67 -1
				//Ű���� �Է��� ��Ʈ���� ���� ��� �ֿܼ� ctrl+z EOF(�Է��ǳ� ��Ʈ���ǳ�) ���� �Է�
				//read�� ����Ʈ(Byte) ��Ʈ������ 1����Ʈ�� �����ϱ⶧���� �ѱ��� ����. ĳ���� ��Ʈ������ ����� ��. ���ڿܿ��� ����Ʈ ��Ʈ���� ���� 
				sb.append((char)in);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) //close�޼ҵ��� null����Ʈ ����ó��
				is.close(); //throws �޼ҵ� ����ó��
			} catch (IOException e) {
				e.printStackTrace();
			} 
			//�Է½�Ʈ�� ���� �� �ڿ�ȸ��(Ű���� �Է��� �ڵ������� ��)
			

		}
		
		System.out.println("�Է°�� : "+sb);		
		
		
		
		
		
		
	}

}
