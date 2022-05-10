package sec04.exam02_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		//문자열 연결연산
		//숫자데이터가 문자열로 변환되어 결합
		String str1 = "JDK" + 6.0; // 6.0 -> "6.0"
		String str2 = str1 + "특징";
		
		System.out.println(str2);
		
		//순서가 문자열이 먼저 오면 3 -> "3"
		String str3 = "JDK" + 3 + 3.0; //"JDK" +"3" -> "JDK3" + "3.0 -> "JDK33.0"
		//순서가 덧셈연산식 구문이 오면, 덧셈결과가 먼저 진행
		String str4 = 3 + 3.0 + "JDK"; //3+3.0 -> 6.0 -> "6.0" + "JDK" -> "6.0JDK"
		
		System.out.println(str3);
		System.out.println(str4);

	}

}
