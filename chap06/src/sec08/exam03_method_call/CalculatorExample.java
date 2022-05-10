package sec08.exam03_method_call;

public class CalculatorExample {

	//JVM이 main()메서드가 존재하는 클래스를 찾아, main 메서드를 실행
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.execute();

	}

}
