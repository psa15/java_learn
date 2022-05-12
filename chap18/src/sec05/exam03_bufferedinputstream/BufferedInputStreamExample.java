package sec05.exam03_bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		//버퍼스트림 사용유무에 따른 성능체크 예제
		long start = 0;
		long end = 0;
		
		//기본스트림
		FileInputStream fis1 = new FileInputStream("C:\\Dev\\Workspace\\chap18\\src\\sec05\\exam03_bufferedinputstream\\geewon2.jpg");
		
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {} //작업 X geewon2.jpg 파일의 내요을 1바이트씩 읽어오기만
		end = System.currentTimeMillis();
		
		System.out.println("버퍼스트림 사용 X: " + (end-start) + "ms");
		fis1.close();
		
		//기본스트림
		FileInputStream fis2 = new FileInputStream("C:\\Dev\\Workspace\\chap18\\src\\sec05\\exam03_bufferedinputstream\\geewon2.jpg");
		//보조스트림 : BufferedStream
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		
		System.out.println("버퍼스트림 사용: " + (end-start) + "ms");
		bis.close();
		fis2.close();
	}

}
