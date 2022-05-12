package sec04.exam02_fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) throws Exception {
		//파일의 내용을 출력하는 예제: 파일 입력스트림
		//현재파일
		FileInputStream fis = new FileInputStream("C:\\Dev\\Workspace\\chap18\\src\\sec04\\exam02_fileinputstream\\FileInputStreamExample.java");
		int data;
		while((data = fis.read()) != -1) { //read()메소드가 1바이트씩 가져와서 data에 저장하고 그 값이 -1이 아니면 true
			System.out.write(data); //console 대상 표준출력스트림(System.out)에 write()메소드를 통해 data변수의 내용을 저장
		}
		fis.close();
	}

}
