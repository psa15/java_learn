package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//객체 생성
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2; //classA.field2 : ClassB field2 = new ClassB();
		//스트림 작업 제외
		classA.field3 = 3; //static 멤버로 원래는 클래스명.field3
		classA.field4 = 4; //transient
		
		//스트림에 저장
		oos.writeObject(classA);
		oos.flush();
		
		oos.close();
		fos.close();
	}

}
