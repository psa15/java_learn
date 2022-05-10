package sec07.exam03_field_polymorphism;


//자동차 클래스
public class Car {
	
	//field
	Tire frontLeftTire = new Tire("fLeft",1);
	Tire frontRightTire = new Tire("fRight", 2);
	Tire backLeftTire = new Tire("bLeft", 3);
	Tire backRightTire = new Tire("bRight", 4);
	
	//default constructor
	
	//method
	int run() {
		System.out.println("자동차가 달립니다.");
		
		//자동차 바퀴 상태(roll()메소드)에 따라 run() or stop() 결정
		if(frontLeftTire.roll() == false) {stop(); return 1;}
		if(frontRightTire.roll() == false) {stop(); return 2;}
		if(backLeftTire.roll() == false) {stop(); return 3;}
		if(backRightTire.roll() == false) {stop(); return 4;}
		
		return 0; //Tire 이상 X
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
