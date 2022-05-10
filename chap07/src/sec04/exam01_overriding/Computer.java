package sec04.exam01_overriding;

public class Computer extends Calculator {

	//areaCircle() 재정의 하면, Computer클래스에서 생성한 메서드가 호출
	//areaCircle() 재정의 X, Calculator클래스의 메서드가 호출
	//@키워드: 어노테이션
	//@아래메서드가 재정의한 메서드라는 의미를 뜻함
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	double methodA(double r) {
		return Math.PI * r * r;
	}
	
}
