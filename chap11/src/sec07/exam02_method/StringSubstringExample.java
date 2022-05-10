package sec07.exam02_method;

public class StringSubstringExample {

	public static void main(String[] args) {

		//부분 문자열 가져오기
		String ssn = "880815-1234567";
		
		//생년월일을 의미하는 주민번호의 앞자리
		String firstNum = ssn.substring(0, 6); //substring(beginIndex, endIndex): endIndex 전까지 가져오기
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //7번부터 마지막까지 
		System.out.println(secondNum);

	}

}
