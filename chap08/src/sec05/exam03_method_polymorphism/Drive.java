package sec05.exam03_method_polymorphism;

public class Drive {
	//메서드의 파라미터를 부모인터페이스로 사용
	public void driver(Vehicle vehicle) {
		vehicle.run(); 
	}
	
	//다형성이 지원이 안되면 각각 차량별로 drive()메소드를 생성해야함
	//다형성으로 코드량이 줄어들게 된다.
	/*
	public void drive(Bus bus) {
		bus.run();
	}
	public void drive(Taxi taxi) {
		taxi.run();
	}
	*/
}
