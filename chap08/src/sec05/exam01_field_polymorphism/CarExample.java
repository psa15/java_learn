package sec05.exam01_field_polymorphism;

//다형성
//하나의 객체가 여러가지 타입(형)을 갖게 되는 것을 의미
public class CarExample {

	public static void main(String[] args) {

		//객체 생성
		Car myCar = new Car();
		
		myCar.run();
		
		//tire change - polymorphism
		System.out.println("타이어를 교체합니다.");
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();

	}
}
