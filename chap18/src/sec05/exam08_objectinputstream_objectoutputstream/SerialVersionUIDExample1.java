package sec05.exam08_objectinputstream_objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//객체 직렬화 작업
public class SerialVersionUIDExample1 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/Object.dat");
		//ObjectOutputStream 클래스: 객체 직렬화 기능을 제공하는 클래스
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//힙영역에 ClassC기억장소가 생성되고 field1에 1을 저장
		ClassC classC = new ClassC();
		classC.field1 = 1;
			
		oos.writeObject(classC); //스트림에 저장된 상태
		oos.flush(); //스트림에 저장된 데이터를 Object.dat파일에 내보내기(스트림 비워짐) 
		
		//생성된 역순으로 연결을 끊기
		oos.close();
		fos.close();
		
	}

}
