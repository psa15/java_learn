package sec10.exam01_static_member;

public class Calculator {
	
	//정적멤버: new 키워드 X
	
	//필드
	static double pi = 3.14159;
	
	//메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
}
