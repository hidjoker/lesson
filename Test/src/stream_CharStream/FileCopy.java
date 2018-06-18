package stream_CharStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {

	public static void main(String[] args) {
		
		File file1 = new File("./src/stream_CharStream/","Source.txt");
		File file2 = new File("./src/stream_CharStream/","Dest.txt");
		
		Reader reader = null;
		BufferedReader br = null;
		Writer writer = null;
		BufferedWriter bw = null;
		
		char[] cbuf = new char[1024];
		
		int len = -1;
		int total = 0;
		
		try {
			
			reader = new FileReader(file1);
			br = new BufferedReader(reader);
			writer = new FileWriter(file2);
			bw = new BufferedWriter(writer);
			
			while((len=br.read(cbuf))!=-1) {
				bw.write(cbuf, 0, len);
				total+=len;
			}
			bw.flush();
						
			System.out.println("���� �Ϸ�, "+total+" Byte");
	
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ���� ����");
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] ����� ���� �߻�");
		} finally {
				try {
					if(br!=null) br.close();
					if(bw!=null) bw.close();
					if(reader!=null) reader.close();
					if(writer!=null) writer.close();
				} catch (IOException e) {
						e.printStackTrace();
				}

		}
		
		
		System.out.println(" + + ���α׷� ���� ���� + + ");
				
		
		
		
	}
	
}
