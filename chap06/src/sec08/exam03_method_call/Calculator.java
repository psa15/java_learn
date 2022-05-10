package sec08.exam03_method_call;

public class Calculator {

	//필드 X
	//생성자 X
	//메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		//double result = (x + y) / 2;
		double result = (double)plus(x,y) / 2;
		return result;
	}
	
	//출력
	void execute() {
		double result = avg(7,10);
//		System.out.println("실행결과: " + result);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
