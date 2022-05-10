package sec02_runtime_exception_try_catch_finally;

//NPE : NullPointerException
//java.lang.NullPointerException 예외
public class NullPointerExceptionExample {

	public static void main(String[] args) {


		 String data = null; //참조타입은 기본값을  null로 사용

		 try {
		 System.out.println(data.toString()); //exception 발생 -> 예외오류 데이터가 발생
		 } catch (NullPointerException ex) { //예외관련 클래스를 오류에 해당하는 정보를 담당하는 클래스를 사용
//			 ex.printStackTrace(); //예외관련 오류정보 출력하는 기능의 메소드
			 //ex안에 관련 오류정보가 출력
			 System.out.println("프로그램 오류. 죄송합니다. 확인중입니다.");
		 }
		 System.out.println("programm end");
	}

}
