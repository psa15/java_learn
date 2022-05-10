package sec08.exam01_split_stringtokenizer;

public class StringSplitExample {

	public static void main(String[] args) {

		//문자열에서 구분자를 이용하여 추출하는 기능예쩨
		String text = "김지원&염미정,구씨,윤명주-탄야";
		
		String[] names = text.split("&|,|-"); //| : or의 의미
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
