package sec10.exam01_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		
		/*
		 프로그램 실행 시 JVM이 Calculator클래스의 static 멤버를 대상으로
		 static 메모리영역에 기억장소를 생성 
		 정적영역에 생성된 기억장소 접근 : 클래스명.정적멤버
		 */
		
		double result1 = Calculator.pi * 10 * 10;
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.multiply(10, 5);
		
		System.out.println("static result1: " + result1);
		System.out.println("static result2: " + result2);
		System.out.println("static result3: " + result3);
	}

}
