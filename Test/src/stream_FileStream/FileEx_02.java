package stream_FileStream;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
		// File Class
		// ���� ������ �ٷ�� Ŭ����
		
//		File file = new File("D:\\storage\\lesson\\Test\\src\\stream_FileStream\\Hello"); //������ ����
		File file = new File("./src/stream_FileStream/Hello"); //����� ����(������ġ�� ����)
		//������Ʈ �ͽ��÷η� -> show in -> system explorer(���Ȯ��)
		
//		//escape sequence
//		//escape character(�����)
//		
//		String str = "\t";  //���� ��
//		String str1 = "\b"; //Backspace
//		String str2 = "\r"; //Carriage Return
//		String str3 = "\n"; //New Line
//		String str4 = "\a": // Alarm �ڹٿ��� �Ұ�
//		
//		System.out.println("100\\");  ����ڷ� �д� ���� �����ϱ� ���� \\ �ι� �Է�
		
		
		System.out.println("toString() : " + file); // ���
		System.out.println("length() : "+file.length()); //byte����
		System.out.println("exists() : "+file.exists());
		
		System.out.println("--------");
		System.out.println("canRead() : "+file.canRead());   //�б� ����
		System.out.println("canWrite() : "+file.canWrite());   //���� ����
		
		System.out.println("--------");
		System.out.println("isDirectory() : " + file.isDirectory()); //���丮���� �������� ����
		

//		+ ���� ���, Absolute Path
//		  - ��Ʈ���丮�κ��� ��� ��θ� ��Ÿ�� ��
//		  - "D:\\FileTest.txt"
//
//		+ ��� ���, Relative Path
//		  - ���α׷��� �ڽ��� ����� ��ġ�� ��������
//		    ��������� ��θ� ��Ÿ�� ��
//
//		  ** ���α׷��� ����� ��ġ = Ŭ�����н�, Classpath
		  
//		.\ - ���� ��ġ
//		..\ - �θ� ���丮
//
//		- ��Ŭ������ �ڹ�������Ʈ CLASSPATH�� ������Ʈ ������ ������

		


		
		
		
		
		
		
		
    }
		
}
