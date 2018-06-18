package collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;


public class CollectionEx_11_Map {
	
	public static void main(String[] args) {
		
		// HashMap과 같고 추가적으로 동기화 처리가 되어있다
		Map map = new Hashtable();
		
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("./Test/src/collection/user.properties"));
		} catch (FileNotFoundException e) { // 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		System.out.println("--------------");
		String user = prop.getProperty("username");
		System.out.println("USER : "+user);
		
		System.out.println("--------------");
		prop.setProperty("username", "hjo");
		System.out.println(prop);

		
		
	}		
}













