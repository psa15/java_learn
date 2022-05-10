package sec07.exam01_constructor;

public class ByteToStringExample {

	public static void main(String[] args) {
		//byte 배열의 데이터를 문자열로 변환
		
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1); //Hello Java 출력 오 신기

		String str2 = new String(bytes, 6, 4); //bytes배열의 6번째부터 4개 출력
		System.out.println(str2);
		
		//문자열 코드: 0 ~ 65535범위의 숫자코드로 정의 (UniCode)
		
		//		int[] arr = {15000, 70000};
//		String str3 = new String(int형배열);
	}

}
