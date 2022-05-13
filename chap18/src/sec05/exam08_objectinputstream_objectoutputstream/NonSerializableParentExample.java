package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class NonSerializableParentExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Child child = new Child();
		//field값 주기
		child.field1 = "김지원";
		child.field2 = "염미정";
		
		oos.writeObject(child); 
		//ObjectOutputStream 에서 제공하는 writeObject() 메소드를 의미
		//Child 클래스에서 생성한 writeObject() 메소드는 위의 메소드가 호출되며 자동호출됨
		
		oos.flush();
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:/Dev/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Child v = (Child) ois.readObject();
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2);
		
		ois.close();
		fis.close();
	}

}
