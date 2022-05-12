package sec05.exam05_bufferedoutputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		/*............*/
		
		//입력
		fis = new FileInputStream("");//기본
		bis = new BufferedInputStream(fis);//보조
		//출력
		fos = new FileOutputStream("");//기본
		bos = new BufferedOutputStream(fos);//보조

	}

}
