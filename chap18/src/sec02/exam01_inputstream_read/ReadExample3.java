package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.spec.InvalidParameterSpecException;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		// 텍스트파일의 내용을 읽어와서 콘솔에 출력하기
		//바이트, 입력, 파일 : FileInputStream 클래스

		InputStream is = new FileInputStream("C:/Dev/Temp/test.txt"); //예외 전가
		int readByteNo;
		byte[] readBytes = new byte[8];
		
		//is 입력스트림을 통하여 readBytes배열에 인덱스 2위치에서부터 3개의 데이터를 저장
		readByteNo = is.read(readBytes, 2, 3); 
		
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		

		is.close(); //입력스트림 객체 닫기(연결 해제)
	}

}
