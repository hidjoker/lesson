package stream_FilterStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_BufferedStream {

	public static void main(String[] args) {
		
		File file1 = new File("./src/stream_FileStream/","Source.txt");
		File file2 = new File("./src/stream_FileStream/","Dest.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] buf = new byte[1024];
		
		int len = -1;
		int total = 0;
		
		try {
			
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			while((len=bis.read(buf))!=-1) {
				bos.write(buf, 0, len);
				total+=len;
				
//				bos.flush(); // flush�޼ҵ�� bos�� ���� �����͸� ������. close�޼ҵ忡 �� ����� ���Ե�
			}
			
			bos.flush(); // Buffered�� ����� ȿ�������� ���� ���� �������� flush���ִ°� ����

			
			System.out.println("���� �Ϸ�, "+total+" Byte");
	
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ���� ����");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ����� ���� �߻�");
		} finally {
			
			//��Ʈ�� �ݱ�
				try {
					if(bis!=null) bis.close();
					if(fis!=null) fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
				try {
					if(bos!=null) bos.close(); //bos close�� ���� ������ ������ ��µ��� �ʴ´�
					if(fos!=null) fos.close();
				} catch (IOException e) {
						e.printStackTrace();
				}

		}
		
		
		System.out.println(" + + ���α׷� ���� ���� + + ");
				
		
		
		
	}
	
}
