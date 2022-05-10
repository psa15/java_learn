package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	public static void findClass() throws Exception{
		//예외 던지기 - 예외처리를 테스트하기 위하여 예외를 수동으로 발생하는 구문
		//예외 전가
		throw new Exception(); //클릭해야함
		
		/* 예외처리
		try {
			throw new Exception();
		} catch (Exception ex) {
			
		}
		*/
	}
}
