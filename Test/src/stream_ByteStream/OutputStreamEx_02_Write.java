package stream_ByteStream;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx_02_Write {

	public static void main(String[] args) {
		
	    OutputStream os;
	    
	    os = System.out; //PrintStream(System.out)(�ڽ�Ŭ����) -> OutputStream(�θ�Ŭ����)

	    byte[] buf = new byte[1024];
	    
	    buf[0] = 65; //'A'   //�ڵ� ����ȯ (int) -> byte �������� ��Ȳ
	    buf[1] = 66; //'B'
	    buf[2] = 67; //'C'
	    buf[3] = 10; //'\n'
	    
	    buf[4] = 'H'; //72   //�ڵ� ����ȯ(char) -> int -> byte
	    buf[5] = 'i'; //105
	    buf[6] = '\n'; //10

	    System.out.println("length : "+buf.length);
	    
	    try {
	    	
	    	os.write(buf);   //1024�� ��� ��� 0���� ä���� �����ʹ� ��ĭ���� ä����
	
			
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
	     
	    System.out.println(" + + + ���α׷� ���� ���� + + +");  //close�޼ҵ�� ��½�Ʈ���� ������ ��� �ȵ�
	    
	}

}
