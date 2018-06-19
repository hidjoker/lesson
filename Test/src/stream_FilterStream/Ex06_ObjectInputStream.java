package stream_FilterStream;

// + ObjectStream
// - 객체 단위로 입출력할 수 있도록 기능을 제공하는 스트림
// - DataInput / DataOutput Interface를 구현하고 있다
//   -> DataInputStream / DataOutputStream의 메소드를 
//       모두 다 가지고 있다
//   -> DataStream이 할 수 있는 일을 모두 할 수 있다
// - readObject(), writeObject()를 사용하여 객체형태로 입출력
// - Collection도 객체형태 유지하면서 입출력함
// - 직렬화, Serialization
//    크기가 큰 데이터를 스트림을 통과시키기 위해 바이트단위로 쪼개는 것
//    void ObjectOutputStream.writeObject(Object obj);
// - 역직렬화, Deserialization
//    바이트 단위로 쪼개져 스트림을 통과한 데이터를 원본형식으로 합치는 것
//    Object ObjectInputStream.readObject();
// - 스트림을 통과하는 객체는 직렬화가능클래스로 생성해야 한다
//   -> implements Serializable 적용된 클래스만 직렬화 가능



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex06_ObjectInputStream {

	public static void main(String[] args) {
		
		// 파일 객체 생성
		File file = new File(
				"./src/stream_FilterStream"
				,"ObjectTest");
		
		// 입력 스트림 선언
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
		
		System.out.println(" + + + 프로그램 정상 종료 + + +");
		
	}
}
