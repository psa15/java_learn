package sec09.exam01_instance_member;

public class CalculatorExample {

	public static void main(String[] args) {
		//new: Calculator 클래스의 인스턴스 멤버를 가지고 힙 영역에 메모리를 생성
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.pi * 10 * 10;
		
		int result2 = myCalc.plus(10, 5);
		int result3 = myCalc.multiply(10, 5);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
