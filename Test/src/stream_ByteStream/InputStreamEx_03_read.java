package stream_ByteStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx_03_read {
	public static void main(String[] args) {
		
	   
		InputStream is;
		is = System.in; 
		
		StringBuffer sb = new StringBuffer();
		
		byte[] buf = new byte[1024]; //1K byte������ ����(ȿ����). \r\n ����
		int len = -1;
		System.out.println("�Է´����....");
				
		try {
			while((len = is.read(buf, 0, buf.length))!=-1) { // ������ ��������� �����ؼ� ����
				sb.append(new String(buf));            //���ۿ� ����� �� ����
				Arrays.fill(buf,(byte)0);              //�Է¹��� �ʱ�ȭ
				System.out.println("�Է� ���� : "+len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
			    if(is!=null) is.close();
	        } catch (IOException e) {
					e.printStackTrace();
		    }
		}
		
		
		System.out.println("�Է°�� : "+sb);		
		
		
	}

}