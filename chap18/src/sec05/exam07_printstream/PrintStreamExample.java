package sec05.exam07_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/file.txt");
		PrintStream ps= new PrintStream(fos);
		
		//1)C:/Dev/Temp/file.txt 파일에 작업
		//스트림에 내용을 채운 상태
		ps.println("[프린터 보조 스트림]");
		ps.print("마치");
		ps.println("프린터가 출력하는 것처럼");
		ps.println("데이터를 출력합니다.");
		
		ps.flush();
		ps.close();
		
		//2)콘솔에 출력작업
		PrintStream ps2 = System.out;
		ps2.println("[프린터 보조 스트림]");
		ps2.print("마치");
		ps2.println("프린터가 출력하는 것처럼");
		ps2.println("데이터를 출력합니다.");
		
		ps2.flush();
		ps2.close();
		
		fos.close();
	}

}
