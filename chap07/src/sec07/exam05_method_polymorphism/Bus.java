package sec07.exam05_method_polymorphism;

public class Bus extends Vehicle{

	//run()메소드 override
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
