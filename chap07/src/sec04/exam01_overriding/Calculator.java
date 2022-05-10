package sec04.exam01_overriding;

//메소드 재정의(overriding)
public class Calculator {

	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return 3.14159 * r * r;
	}
}
