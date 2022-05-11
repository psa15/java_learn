package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.spec.InvalidParameterSpecException;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		// 텍스트파일의 내용을 읽어와서 콘솔에 출력하기
		//바이트, 입력, 파일 : FileInputStream 클래스
		
		//FileInputStream 의 부모가 InputStream -> 다형성
		//입력 스트림 객체
		InputStream is = new FileInputStream("C:/Dev/Temp/test.txt"); //예외 전가
		int readByte;
		while(true) {
			readByte = is.read(); //test.txt파일의 1바이트씩 읽어온 값을 문자셋코드(아스키코드)로 반환
			
			//읽어온 내용이 없을 경우
			if(readByte == -1) break;
			//-1이 아니라면
			System.out.println((char)readByte);
		}
		is.close(); //입력스트림 객체 닫기
	}

}
