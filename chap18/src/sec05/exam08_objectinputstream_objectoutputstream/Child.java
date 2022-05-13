package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Parent 클래스 상속받고, Serializable 인터페이스 구현
public class Child extends Parent implements Serializable{
	public String field2;
	
	//직렬화 (접근자는 private)
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(field1); //부모필드 직렬화 작업
		out.defaultWriteObject(); //자식 필드를 직렬화시켜주는 메소드
	}
	
	//역직렬화 (접근자는 private)
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		field1 = in.readUTF(); //부모필드 역직렬화 작업
		in.defaultReadObject(); // 자식필드값을 역직렬화
	}
}
