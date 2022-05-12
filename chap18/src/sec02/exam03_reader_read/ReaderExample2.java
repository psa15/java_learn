package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
		//문자기반으로 입력스트림 작업
		//파일이 없으면 예외발생
		Reader reader = new FileReader("C:/Dev/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		
		while(true) {
			//cbuf char 배열의 크기만큼 스트림을 통하여 읽어와서 배열에 저장
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();

	}

}
