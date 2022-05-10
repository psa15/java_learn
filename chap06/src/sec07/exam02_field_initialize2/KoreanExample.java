package sec07.exam02_field_initialize2;

public class KoreanExample {

	public static void main(String[] args) {
		// 객체 선언 및 생성

//		Korean k1 = new Korean(); //에러남(수동으로 생성자 선언해서)
		
		//파라미터가 있는 생성자를 통하여 데이터 저장
		Korean k1 = new Korean("홍길동", "123456-1234567");

	}

}
