package sec02.exam03_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		// 문자기반의 출력스트림 예제
		//파일 존재 유무에 상관 없이 파일 재 생성
		Writer writer = new FileWriter("C:/Dev/Temp/test.txt");
		
		String data = "안녕 나의 해방일지";
		
//		writer.write(data);
		writer.write(data, 3, 7); //스트림에 "나의 해방일지" 저장(writer라는 스트림에 write라는 메소드가(data,3,7)을 가지고 저장)
		
		writer.flush(); //스트림의 데이터를 test.txt파일에 내용으로 쓰는 작업
		writer.close();
	}

}
