package sec01.exam01_primitivetype;

public class CharExample {

	public static void main(String[] args) {
		//정수형 char 데이터 타입: 문자 데이터 사용 목적
		// 문자표현 -> 'a' (큰 따옴표 X) 1개의 문자의미로 표현
		
		//아스키, 유니코드 용어
		
		//A 출력
		char c1 = 'A'; //문자표현 - 대문자 A의 코드값이 저장
		char c2 = 65; //숫자코드표현(10진수)
		char c3 = '\u0041'; //유니코드 표현(16진수)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//가 출력
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		int uniCode = c1; //묵시적 형변환
		System.out.println(uniCode); //65출력
		
		uniCode = c4;
		System.out.println(uniCode); //44032출력
		
		uniCode = '홍';
		System.out.println(uniCode); //54861 출력
		
		//문자열 데이터 타입 - String
		String name = "홍길동";
		System.out.println(name);
	}

}
