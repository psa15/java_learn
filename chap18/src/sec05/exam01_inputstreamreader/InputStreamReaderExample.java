package sec05.exam01_inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		//바이트기반의 스트림 먼저 존재
		InputStream is = System.in; //표준 입력스트림 - 콘솔에서 데이터를 입력받아 저장
		//바이트스트림 -> 문자스트림으로 변환하는 기능을 제공 (InputStreamReader클래스)
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();

	}

}
