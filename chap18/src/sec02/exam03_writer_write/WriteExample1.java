package sec02.exam03_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		// 문자기반의 출력스트림 예제
		//파일 존재 유무에 상관 없이 파일 재 생성
		Writer writer = new FileWriter("C:/Dev/Temp/test.txt");
		
		//문자열(String) : 문자 1개 이상을 열로 나열한 형태
		char[] data = "김지원".toCharArray();//문자열인 "김지원"을 char형 배열로 변환
		//출력스트림 writer객체에 데이터를 저장
		for (int i=0; i<data.length; i++) {
			writer.write(data[i]); //write(int c); char타입의 data가 자동형변환됨	
		}
		
		writer.flush(); //스트림의 데이터를 test.txt파일에 내용으로 쓰는 작업
		writer.close();
	}

}
