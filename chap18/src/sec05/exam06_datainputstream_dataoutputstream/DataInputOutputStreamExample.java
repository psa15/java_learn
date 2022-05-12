package sec05.exam06_datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		//파일: 텍스트 파일 & 이진파일(메모장으로 열었을 때 깨진 파일)로 구분
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);

		//스트림에 작업데이터를 채움(저장)
		//write___();
		dos.writeUTF("김지원");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("탄야");
		dos.writeDouble(90.5);
		dos.writeInt(2);
		
		 dos.flush(); //데이터를 내보내기
		 
		 //객체 닫기 순서: 객체 생성된 역순으로 닫기 (생성: 기본 -> 보조 / 닫기: 보조 -> 기본)
		 dos.close();
		 fos.close();
		 
		 //읽어오기
		 FileInputStream fis = new FileInputStream("C:/Dev/Temp/primitive.dat");
		 DataInputStream dis = new DataInputStream(fis);
		 
		 for(int i=0; i<2; i++) {//2번 채웠으니까 i<2
			 //기본데이ㅓ타입을 작업한 타입대로 읽어와야 한다.
			 //작성한 순서 맞추기
			 String name = dis.readUTF();
			 double score = dis.readDouble();
			 int order = dis.readInt();
			 System.out.println(name + " : " + score + " : " + order);
		 }
		 
		 dis.close();
		 fis.close();
	}

}
