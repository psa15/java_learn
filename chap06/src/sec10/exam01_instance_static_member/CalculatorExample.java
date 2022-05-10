package sec10.exam01_instance_static_member;

public class CalculatorExample {

	public static void main(String[] args) {
		
		//객체생성 작업 전에 JVM이  Calculator 클래스의 static 멤버를 대상으로 static영역에 메모리 할당
		Calculator myCalc = new Calculator();
		Calculator myCalc2 = new Calculator();
		Calculator myCalc3 = new Calculator();
		

	}

}
