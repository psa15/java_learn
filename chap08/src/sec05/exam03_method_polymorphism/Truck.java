package sec05.exam03_method_polymorphism;

public class Truck implements Vehicle {

	@Override
	public void run() {
		System.out.println("트럭이 달립니다.");
	}
}
