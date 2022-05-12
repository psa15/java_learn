package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableReader {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Dev/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA v = (ClassA)ois.readObject();
		
		System.out.println("field1: " + v.field1);
		System.out.println("field2: " + v.field2.field1);
		
		//직렬화 대상에서 제외되어 필드의 기본값만 출력
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);
	}
}
