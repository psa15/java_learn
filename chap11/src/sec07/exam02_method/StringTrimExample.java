package sec07.exam02_method;

public class StringTrimExample {

	public static void main(String[] args) {


		//공백이 존재
		String tel1 = "   01";
		String tel2 = "123  ";
		String tel3 = "     12 34    ";
		
		//공백제거 : 왼쪽, 오른쪽, 왼쪽과 오른쪽만 제거 가능
		//문자열 가운데 공백 제거 불가
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);

	}

}
