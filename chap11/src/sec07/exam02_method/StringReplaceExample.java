package sec07.exam02_method;

public class StringReplaceExample {

	public static void main(String[] args) {

//		CharSequence 인터페이스: String클래스의 부모
		String oldStr = "자바는 객체지향 언어 입니다. 자바는 풍부한 API를 지원합니다";
		String newStr = oldStr.replace("자바", "JAVA"); //변수.replace(CharSequence target, CharSequence replacement)
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
