package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

//객체 직렬화하는 작업으로 사용하는 클래스는 반드시 Serializable 인터페이스를 구현
public class ClassA implements Serializable {
	//에러가 없음 - 재정의할 추상메소드 X
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//직렬화 대상
	int field1;
	ClassB field2 = new ClassB();
	
	//직렬화에서 제외됨
	static int field3;
	transient int field4;
}
