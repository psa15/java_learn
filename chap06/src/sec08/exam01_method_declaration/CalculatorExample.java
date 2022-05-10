package sec08.exam01_method_declaration;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		
		int result1 = myCalc.plus(10, 2); //plus()메소드의 리턴타입이 int형이기 때문에 result1도 int형
		System.out.println("result1: " + result1);
		
		if (result1 >= 20) {
			System.out.println("크다");
		} else {
			System.out.println("작다");
		}
		
		double result2 = myCalc.divide(10, 2);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}

}
