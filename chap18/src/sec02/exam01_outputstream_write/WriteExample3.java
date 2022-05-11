package sec02.exam01_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		//파일이 존재유무에 상관 없이 새로 파일 생성과 함께 객체 생성
		OutputStream os = new FileOutputStream("C:/Dev/Temp/test.txt");
		
		byte[] data = "ABC".getBytes();//65, 66, 67 저장

		os.write(data, 1, 2); //A스킵, B, C문자가 스트림에 저장
		
		os.flush(); //스트림의 데이터가 test.txt파일에 작성됨
		os.close();
	}

}
