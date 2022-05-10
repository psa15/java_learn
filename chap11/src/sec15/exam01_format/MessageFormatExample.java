package sec15.exam01_format;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {

		String id = "java";
		String name = "홍길동";
		String tel = "010-2123-1234";
		
		//문자열 + :불편한 사항이 발생
		//\n: 줄 변경(Escape Sequence문자)
		String text = "회원ID : {0} \n회원이름: {1} \n회원전화: {2}";
		
		// Object... 변수: 가변인수, 메서드 정의시 파라미터는 마지막에 사용
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		//Onject... 변수: 배열로 처리가 된더,
		String sql = "insert into member values({0},{1},{2})";
		Object[] arguments = {"jaca","홍길동","010-123-4556"};
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
	}

}
