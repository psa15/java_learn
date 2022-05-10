package sec02_runtime_exception_try_catch_finally;

//숫자형식의 문자열이 아닌 값을 숫자로 변환시 예외발생 java.lang.NumberFormatException
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
	
	
	String data1 = "100"; //숫자로 되어있는 문자열
	String data2 = "a100"; //문자열(소문자a로 그냥 문자열)
	
	int value1 = 0;
	int value2 = 0;
	try {
	value1 = Integer.parseInt(data1); 
	value2 = Integer.parseInt(data2);//int형으로 변환되다 에러(예외) 발생
	} catch(NumberFormatException ex) {
//		ex.printStackTrace();
		System.out.println("exception 발생");
	}
	
	int result = value1 + value2; 
	//try-catch문으로 value1과 value2는 지역변수로 취급되기 때문에 에러발생 -> 변수 선언 필요, 메소드 안에서 모든 변수는 초기값 필요
	System.out.println(data1 + "+" + data2 + "=" + result);
	
	}

}
