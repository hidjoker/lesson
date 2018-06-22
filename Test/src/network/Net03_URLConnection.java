package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Net03_URLConnection {
	
//	 + URLConnection class
//	  - ���ø����̼�(���α׷�)�� URL ������ ��� �����ϴ� Ŭ����
//	  - URL�� ������ �аų� URL�� �����͸� ������ �� ����ϴ� Ŭ����
//	  - �߻�Ŭ����
//	     ��ü���� �Ұ�
//	     URL��ü���� openConnection() �޼ҵ�� ��ü�� �� ���
//	  - �������
//	    1. URL ��ü ����
//	    2. openConnection() -> URLConnection ��ü ������
//	    3. getInputStream() -> InputStream ���
//	    4. InputStreamReader ���� -> Reader�� ��ȯ
//	    5. BufferedReader ���� -> BufferedReader�� ��ȯ
//	    6. �б�( read() )
//	    7. ���� ���� ó��(��������, �������, ...)


	public static void main(String[] args) {
		
		String urlStr
		= "https://www.oracle.com:443/downloads/index.html";
		
		URL url = null; // URL ���� ��ü
		URLConnection conn = null; // URL ���� ��ü
		
		BufferedReader reader = null; // �Է½�Ʈ��
		
		char[] cbuf = new char[1024]; // �Է½�Ʈ�� ���� ����
		int len = -1; // �Է½�Ʈ�� �Է� ����
		
		try {
			url = new URL(urlStr); // ������ URL ����
			conn = url.openConnection(); // ���� ����
			
			// ���� ��ü�κ��� ��Ʈ�� ���
			reader = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream() ));
			
			while((len = reader.read(cbuf))!= -1) {
				System.out.println(
						new String(cbuf,0,len));
			}
			
			// conn -> InputStream
			// InputStream -> Reader
			// Reader -> BufferedReader
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(reader!=null) reader.close();
				} catch (IOException e) {}		
		}
		
		
	
	}
	
}
