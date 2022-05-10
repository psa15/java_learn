package sec12.exam01_wrapper;

public class StringToPrimitiveValueExample {

	public static void main(String[] args) {

		//숫자형식을 가지고 있는 문자열을 기본타입으로 변환하는 예제
		int value1 = Integer.parseInt("10"); //"10" -> 10
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("Value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

	}

}
