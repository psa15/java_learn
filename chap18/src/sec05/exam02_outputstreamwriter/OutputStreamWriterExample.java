package sec05.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		//바이트기반 출력스트림 객체 생성
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/file.txt");
		//문자기반 출력스트림 객체 변환
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data); //writer 스트림에 write()메소드를 통해 data를 저장
		
		writer.flush();
		writer.close();
		
		System.out.println("파일 저장 완료");

	}

}
