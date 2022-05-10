package sec07.exam05_method_polymorphism;

public class Taxi extends Vehicle {

	//run()메소드 override
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
