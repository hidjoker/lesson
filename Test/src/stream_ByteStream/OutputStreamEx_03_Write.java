package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_03_Write {

	public static void main(String[] args) {
		
	    OutputStream os;
	    
	    os = System.out; //PrintStream(System.out)(�ڽ�Ŭ����) -> OutputStream(�θ�Ŭ����)

	    byte[] buf = new byte[1024];
	    
	    int len = 0;
	    buf[len++] = 65; //'A'   //�ڵ� ����ȯ (int) -> byte �������� ��Ȳ
	    buf[len++] = 66; //'B'
	    buf[len++] = 67; //'C'
	    buf[len++] = 10; //'\n'
	    
	    buf[len++] = 'H'; //72   //�ڵ� ����ȯ(char) -> int -> byte
	    buf[len++] = 'i'; //105
	    buf[len++] = '\n'; //10

	    System.out.println("length : "+buf.length);
	    
	    try {
	    	os.write(buf, 0, len);   //1024�������� 0 ~ len �ε������� ���
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				if(os!=null) os.close();  // ��½�Ʈ�� ��ȯ
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	     
	    System.out.println(" + + + ���α׷� ���� ���� + + + ");  //close�޼ҵ�� ��½�Ʈ���� ������ ��� �ȵ�
	    
	}

}
