package stream_FilterStream;

// + ObjectStream
// - ��ü ������ ������� �� �ֵ��� ����� �����ϴ� ��Ʈ��
// - DataInput / DataOutput Interface�� �����ϰ� �ִ�
//   -> DataInputStream / DataOutputStream�� �޼ҵ带 
//       ��� �� ������ �ִ�
//   -> DataStream�� �� �� �ִ� ���� ��� �� �� �ִ�
// - readObject(), writeObject()�� ����Ͽ� ��ü���·� �����
// - Collection�� ��ü���� �����ϸ鼭 �������
// - ����ȭ, Serialization
//    ũ�Ⱑ ū �����͸� ��Ʈ���� �����Ű�� ���� ����Ʈ������ �ɰ��� ��
//    void ObjectOutputStream.writeObject(Object obj);
// - ������ȭ, Deserialization
//    ����Ʈ ������ �ɰ��� ��Ʈ���� ����� �����͸� ������������ ��ġ�� ��
//    Object ObjectInputStream.readObject();
// - ��Ʈ���� ����ϴ� ��ü�� ����ȭ����Ŭ������ �����ؾ� �Ѵ�
//   -> implements Serializable ����� Ŭ������ ����ȭ ����



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex06_ObjectInputStream {

	public static void main(String[] args) {
		
		// ���� ��ü ����
		File file = new File(
				"./src/stream_FilterStream"
				,"ObjectTest");
		
		// �Է� ��Ʈ�� ����
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Point p1 = (Point)ois.readObject();
			System.out.println(p1);
			System.out.println(ois.readObject());
			

		} catch (FileNotFoundException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		} catch (ClassNotFoundException e) { e.printStackTrace();
		} finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();				
			} catch (IOException e) { e.printStackTrace();
			}
		}
		
		System.out.println(" + + + ���α׷� ���� ���� + + +");
		
	}
}
