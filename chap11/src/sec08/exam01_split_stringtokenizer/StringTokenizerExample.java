package sec08.exam01_split_stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {

		String text = "김지원/윤명주/이은유";
		
		// 방법1)
		StringTokenizer st = new StringTokenizer(text, "/");
		
		int countTokens = st.countTokens(); //3
		System.out.println(countTokens);
		
		for(int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		//방법2) - 이터레이터(반복문) 활용
		st = new StringTokenizer(text,"/");
		while (st.hasMoreTokens()) { //hasMoreTokens(): t or false / st객체가 가리키는 위치(포인터, 커서)에 데이터존재 유무 체크 true면 nextToken()에 의해 커서 다음 위치로 포이터 이동
			String token = st.nextToken(); //포인터에 위치한 값을 읽어오면서 다음 아래위치로 포인터 이동
			System.out.println(token);
		}
	}

}
