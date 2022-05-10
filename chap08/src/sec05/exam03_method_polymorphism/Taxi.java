package sec05.exam03_method_polymorphism;

public class Taxi implements Vehicle {

	//run()메소드 override
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
