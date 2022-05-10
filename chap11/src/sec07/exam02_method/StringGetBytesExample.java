package sec07.exam02_method;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {

		String str = "안녕하세요";
		
		//자바 기본인코딩: UTF-8
		
		//String -> byte[] 변환
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length); //str을 bytes 로 변경했을 때 몇글자나 나오는지
		//bytes1.length: 15 출력
		
		//byte[] -> String
		String str1 = new String(bytes1);
		System.out.println("byte[] -> String: " + str1); //byte[] -> String: 안녕하세요
		
		//EUC-KR인코딩: 영문 1바이트, 한글 2바이트
		try {
			byte[] bytes2 = str.getBytes("EUC-KR"); //예외문법요구하는 이유: 인코딩 이름이 "EUC-KR" 오타일까봐
			System.out.println("bytes2.length: " +bytes2.length); //10byte로 처리 (2바이트 * 5)
			
			String str2 = new String(bytes2, "EUC-KR"); //String(bytes, charsetName)
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("byte3 -> String: " + str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
