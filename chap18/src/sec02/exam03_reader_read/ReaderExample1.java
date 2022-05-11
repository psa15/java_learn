package sec02.exam03_reader_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		//문자기반으로 입력스트림 작업
		//파일이 없으면 예외발생
		Reader reader = new FileReader("C:/Dev/Temp/test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.println((char)readData);
		}
		
		reader.close();

	}

}
