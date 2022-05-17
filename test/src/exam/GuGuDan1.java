package exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class GuGuDan1 {

	public static void WriteGuGuDan() throws Exception {
		//1)
//		FileOutputStream fos = new FileOutputStream("C:/Dev/Temp/gugudan.txt");
//		Writer writer = new OutputStreamWriter(fos);
		
		Writer writer = new FileWriter("C:/Dev/Temp/gugudan.txt");
		
		//구구단
		//System.out : 표준 출력 스트림(console)
		//System.out.println(); 대신 writer.write -> writer: C:/Dev/Temp/gugudan.txt
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
		
		System.out.println("구구단 파일 입력 완료");
	}
	
	public static void ReadGuGuDan() throws Exception {
		FileReader fw = new FileReader("C:/Dev/Temp/gugudan.txt");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fw.read(cbuf)) != -1) {
			String data = new String(cbuf,0, readCharNo);
			System.out.print(data);
		}
		fw.close();
	}
}
