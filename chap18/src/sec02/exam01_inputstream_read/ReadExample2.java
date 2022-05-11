package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.spec.InvalidParameterSpecException;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		// 텍스트파일의 내용을 읽어와서 콘솔에 출력하기
		//바이트, 입력, 파일 : FileInputStream 클래스
		
		//FileInputStream 의 부모가 InputStream -> 다형성
		//입력 스트림 객체
		InputStream is = new FileInputStream("C:/Dev/Temp/test.txt"); //예외 전가
		int readByte;
		byte[] readBytes = new byte[3]; //텍스트 파일의 내용을 읽어와 저장하는 임시 기억장소의 역할
		String data = "";
		
		while(true) {
			readByte = is.read(readBytes);//test.txt.파일의 내용을 readBytes배열의 크기만큼 읽어와 배열에 저장
			
			//읽어온 내용이 없을 경우
			if(readByte == -1) break;
			//바이트 배열의 인덱스 0위치에서부터 읽어온 크기길이만큼의 내용을 문자열로 변환하여 data변수에 누적
			data += new String(readBytes, 0, readByte); 
			//-1이 아니라면
		
		}
		System.out.println(data);
		is.close(); //입력스트림 객체 닫기
	}

}
