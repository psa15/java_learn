package sec10.exam01_pattern_match;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		//이스케이프 시퀀스(Escape Sequence): '\ +  문자' 로 구성된 예약된 기능의 문법
//		System.out.println("김지원\t염미정"); //\t : Tab키 의미로 해석
//		System.out.println("\\"); // \\ : \ 출력
		
		
//		String regExp = "정규식패턴문자열"
		//전화번호 패턴의 정규식 문법
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; 
		// (02|010) : 02 or 010 ()은 그냥 묶은 것
		// \\d{3,4} : 0~ 9 중 3 글자 혹은 4글자
		
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data); //Pattern.matches(regex, input)
		if(result) {
			System.out.println("정규식 일치");
		} else {
			System.out.println("정규식 불일치"); 
		}


	}

}
