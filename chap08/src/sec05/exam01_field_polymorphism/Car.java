package sec05.exam01_field_polymorphism;


//자동차 클래스
public class Car {
	
	//필드 다형성
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
