package sec04.exam04_file_writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		//package sec02.exam03_writer_write 의 WriteExample1처럼 해도되나 file이 많이 사용되다 마지막에 FileWriter fw = new FileWriter(file); 를 쓸 수도 있음 
		File file = new File("C:/Dev/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true); 
		//FileWriter(File file, boolean append); 
		//append가 true: 기존 파일에 내용을 추가, 재 실행해도 새로운 파일 생성X(기존 파일이 없으면 파일생성하고 내용 추가)
		
		fw.write("FileWriter는 한글로 된" + "\r\n");//"\r\n": 줄바꿈
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		
		System.out.println("파일 내용이 저장됨");

	}

}
