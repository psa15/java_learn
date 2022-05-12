package sec04.exam03_fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		//geewon4.jpg 파일 복사 예제
		String originalFileName = "C:\\Dev\\Workspace\\chap18\\src\\sec04\\exam03_fileoutputstream\\geewon4.jpg";
		String targetFileName = "C:/Dev/Temp/geewon4.jpg";
		
		//빈 파일 생성
		FileInputStream fis = new FileInputStream(originalFileName); //원본파일에 대한 입력스트림 -> 파일이 존재해야함 51,677bytes
		FileOutputStream fos = new FileOutputStream(targetFileName); //사본작업을 위한 출력스트림 -> 파일 생성 0byte
		
		//읽어온 바이트 수
		int readByteNo;
		//임시기억장소
		byte[] readBytes = new byte[100]; //geewon4.jpg: 51,677bytes
		
		//fis.read(readBytes) : fis입력스트림을 통하여 read()메소드가 geewon4.jpg 파일의 내용을 100바이트씩 읽어 readBytes 배열에 저장
		while((readByteNo = fis.read(readBytes)) != -1) {
			//fos출력스트림에 write()메소드를 이용하여 readBytes바이트 배열의 인덱스0 위치에서 readByteNo갯수만큼 스트림에 저장
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();//fos스트림의 내용을 C:/Dev/Temp/geewon4.jpg에 저장
		fos.close();
		
		fis.close();
		
		System.out.println("복사 완료");
	}

}
