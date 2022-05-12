package sec05.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		//기본스트림 only, 기본스트림+보조(버퍼)스트림 성능 비교 
		
		//geewon4.jpg 파일 복사
		String originalFileName = "C:\\Dev\\Workspace\\chap18\\src\\sec05\\exam05_bufferedoutputstream\\geewon4.jpg";
		String targetFileName = "C:/Dev/Temp/geewon4.jpg";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		//입력스트림은 버퍼보조스트림을 공통 사용
		//출력스트림 버퍼보조스트림 사용 X / O
		
		//1)출력버퍼보조스트림 사용 X
		fis = new FileInputStream(originalFileName);
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream(targetFileName);
		
		start = System.currentTimeMillis();
		//작업
		while((data = bis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		System.out.println("출력 버퍼 사용 X: " + (end - start) + "ms");
		
		//2)출력버퍼보조스트림 사용
		fis = new FileInputStream(originalFileName); //원본파일에 대한 입력스트림 -> 파일이 존재해야함 51,677bytes
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream(targetFileName); //사본작업을 위한 출력스트림 -> 파일 생성 0byte
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		//작업
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		bos.flush();
		end = System.currentTimeMillis();
		System.out.println("출력 버퍼 사용 : " + (end - start) + "ms");
		
		bos.close();
		fos.close();
		bis.close();
		fis.close();

		System.out.println("복사 완료");
	}

}
