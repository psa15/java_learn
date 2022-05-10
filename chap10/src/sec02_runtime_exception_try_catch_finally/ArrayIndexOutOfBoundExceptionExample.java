package sec02_runtime_exception_try_catch_finally;

//배열의 인덱스 요소가 존재하지 않을 경우 예외 발생
public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		//String[] args = {"김지원"};
		try {
		String data1 = args[0];
		String data2 = args[1]; //exception 발생1
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]); //예외발생2
		System.out.println("programm end");

	}

}
