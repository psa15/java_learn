package sec02_runtime_exception;

//숫자형식의 문자열이 아닌 값을 숫자로 변환시 예외발생 java.lang.NumberFormatException
public class NumberFormatExceptionExample {
	public static void main(String[] args) {
	/*
	 기본타입(원시타입) : primitive type 8개
	 byte, short, int, long
	 char
	 float, double
	 boolean
	 
	 기본 데이터타입을 위하여 보조적으로 기능을 제공하기 위한 목적으로 클래스들이 JDK에 존재 -> Wrapper클래스 
	Byte;
	Short;
	Integer;
	Long;
	Character;
	Float;
	Double;
	Boolean;
	*/
	
	String data1 = "100"; //숫자로 되어있는 문자열
	String data2 = "a100"; //문자열(소문자a로 그냥 문자열)
	
//	Integer.parseInt("숫자형식의 문자열"); //숫자형식의 문자열 int형 숫자로 변환하는 기능
	int value1 = Integer.parseInt(data1); //int형으로 변환 value1 = 100;
	int value2 = Integer.parseInt(data2);//int형으로 변환되다 에러(예외) 발생
	
	int result = value1 + value2;
	System.out.println(data1 + "+" + data2 + "=" + result);
	
	}

}
