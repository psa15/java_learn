package exam;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class GugudanMain {

	public static void main(String[] args) throws Exception {
		//gugudan.txt파일 생성 및 구구단 작성
		//바이트기반 출력스트림 객체 생성
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/gugudan.txt");
		//문자기반 출력스트림 객체 변환
		Writer writer = new OutputStreamWriter(fos);
		
		//구구단 for문
		for(int i=1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				if(i == 1) {
					writer.write(j+ "단 \t");
					continue;
				}
				writer.write(j + "*" + i + "=" + (j*i) + "\t");
			}
			writer.write("\n");
		}
				
		writer.flush();
		writer.close();

		
		//콘솔에 출력
		FileReader fr = new FileReader("C:/Dev/Temp/gugudan.txt");
		int readCharNo;
		char[] gugudan = new char[100];
		while((readCharNo = fr.read(gugudan)) != -1) {
			String data = new String(gugudan, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}

}