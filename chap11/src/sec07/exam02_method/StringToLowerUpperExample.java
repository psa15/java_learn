package sec07.exam02_method;

public class StringToLowerUpperExample {

	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		//문자열 비교시 대소문자 구분
		System.out.println(str1.equals(str2)); //false
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str1.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); //true

		System.out.println(str1.equalsIgnoreCase(str2)); //true -> 대소문자 구분 안함
	}

}
