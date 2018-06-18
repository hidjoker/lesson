package stream_FilterStream;

// + DataStream
// - �ڹ� �⺻�ڷ��� �����͸� �����ϸ鼭 ������ϴ� ����� ����




import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_DataOutputStream {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		File file = new File(
				"./src/stream_FilterStream"
				,"DataTest");
		
		// ���� ��� ��Ʈ��
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		
		try {
			// ���� ��� ��Ʈ�� ����
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);

			dos.writeInt(100);
			dos.writeBoolean(true);
			dos.writeChar('T');
		
			
			// ������ ��� ��Ʈ�� ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// ��Ʈ�� �ݱ�
				if(dos!=null) dos.close();
				if(fos!=null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
