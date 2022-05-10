package sec07.exam02_field_initialize;

public class KoreanExample {

	public static void main(String[] args) {
		// 객체 선언 및 생성
		//객체 선언: Korean k1 스택영역에 메모리만 생성
		//생성: k1 = new Korean() 힙영역에 메모리 생성되고 스택영역에 주소 할당된 상태
		Korean k1 = new Korean();
		
		//객체.필드를 이용하여 데이터 저장
		k1.name = "김지원";
		k1.ssn = "123456-1234567";

	}

}
