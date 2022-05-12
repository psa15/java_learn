package sec05.exam04_bufferedreader;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		//문자기반 스트림에 버퍼보조스트림 사용
		
		InputStream is = System.in; //기본 바이트 스트림
		Reader reader = new InputStreamReader(is); //기본바이트스트림 -> 문자스트림 변환 보조스트림 reader
		BufferedReader br = new BufferedReader(reader); //문자 보조스트림 생성
		
		System.out.print("입력: ");
		String lineString = br.readLine(); //콘솔에 입력한 데이터를 줄단위로 읽는 기능
		
		System.out.println("출력: " + lineString);

	}

}
