package sec02_runtime_exception;

//NPE : NullPointerException
//java.lang.NullPointerException 예외
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// . : 참조연산자, 힙영역의 멤버를 참조하기 위하여 사용
		//객체(변수)의 주소를 가지고 있을 때 사용
		//사용법: 객체.필드 / 객체.메소드()

		 String data = null; //참조타입은 기본값을  null로 사용
//		 data = "홍길동"; //힙 영역에 "홍길동" 문자열 데이터의 기억장소가 생성, 그 주소가 data변수에 대입
		 
		 System.out.println(data.toString());
		 System.out.println("programm end");
	}

}
