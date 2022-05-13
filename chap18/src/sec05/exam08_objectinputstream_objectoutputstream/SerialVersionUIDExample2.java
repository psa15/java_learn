package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//객체 역직렬화
public class SerialVersionUIDExample2 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Dev/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassC classC = (ClassC) ois.readObject();
		System.out.println("field1: " + classC.field1);

	}

}
