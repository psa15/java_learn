package sec09.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {

//		StringBuffer 클래스: 멀티 쓰레드 안정
//		StringBuilder 클래스 : 단일 쓰레드
		
		StringBuilder sb = new StringBuilder(); //최초 생성된 힙영역의 기억장소에 문자열 데이터를 관리 (기억장소 변경 X)
		 
		//값 추가
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb);//sb.toString() 생략되어 사용
		
		//값 삽입
		sb.insert(4, "2"); //sb.insert(offset,data); offset위치에 data 삽입
		System.out.println(sb.toString());
		
		//값 변경
		sb.setCharAt(4, '6');
		System.out.println(sb);
		
		//특정 범위의 문자열 변경
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		//값 삭제 : index 4에서부터 5를 제외한 범위의 데이터를 삭제
		sb.delete(4, 5);
		System.out.println(sb);
		
		int length = sb.length();
		System.out.println("총 문자 수: " + length);
		
		String result = sb.toString();
		System.out.println(result);
	}

}
