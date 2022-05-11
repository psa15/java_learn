package sec02.exam01_outputstream_write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {

		//파일이 존재유무에 상관 없이 새로 파일 생성과 함께 객체 생성
		OutputStream os = new FileOutputStream("C:/Dev/Temp/test.txt");
		
		byte[] data = "ABC".getBytes();//65, 66, 67 저장
		for(int i=0; i<data.length; i++) {
			os.write(data[i]); //한바이트씩 스트림에 저장
		}
		//스트림에 데이터가 채워진 상태
		
		os.flush(); //스트림의 데이터가 test.txt파일에 작성됨
		os.close();
	}

}
