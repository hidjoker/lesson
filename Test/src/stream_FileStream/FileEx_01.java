package stream_FileStream;

import java.io.File;

public class FileEx_01 {

	public static void main(String[] args) {
		
		// File Class
		// ���� ������ �ٷ�� Ŭ����
		
		File file = new File("D:/FileTest.txt");
		System.out.println("toString() : " + file); // ���
		System.out.println("length() : "+file.length()); //byte����
		System.out.println("exists() : "+file.exists());
		
		System.out.println("--------");
		System.out.println("canRead() : "+file.canRead());   //�б� ����
		System.out.println("canWrite() : "+file.canWrite());   //���� ����
		
		System.out.println("--------");
		System.out.println("isDirectory() : " + file.isDirectory()); //���丮���� �������� ����
		
		
		
		
		
		
		
		
		
		
    }
		
}
