package sec04.exam04_file_reader;

import java.io.FileReader;

//입력스트림은 원본의 내용을 읽어와서 임시기억장소 배열에 저장int readCharNo;
//출력스트림: 임시기억장소(변수(1byte씩), 배열)의 내용을 읽어와서 출력스트림에 저장하고 flush()(대상에 출력)한다
public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		//파일의 내용을 출력하는 예제: 파일입력스트림(문자기반)
		FileReader fr = new FileReader("C:\\Dev\\Workspace\\chap18\\src\\sec04\\exam04_file_reader\\FileReaderExample.java");
		//컴파일되어서 .class파일이 생성되면 .class파일에서 .java파일을 불러오는거임
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();

	}

}
