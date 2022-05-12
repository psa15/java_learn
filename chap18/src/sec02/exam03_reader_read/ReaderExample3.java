package sec02.exam03_reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception {
		//문자기반으로 입력스트림 작업
		//파일이 없으면 예외발생
		Reader reader = new FileReader("C:/Dev/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		
		//스트림을 통하여 cbuf배열의 인덱스 1위치에 2개 값을 저장
		readCharNo = reader.read(cbuf, 1, 2); //배열크기가 3이상이어야함
		
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		
		reader.close();

	}

}
