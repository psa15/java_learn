package sec07.exam05_method_polymorphism;

public class DriveExample {

	public static void main(String[] args) {

		Drive drive = new Drive();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개변수의 다형성
		drive.driver(bus); //버스가 달립니다.
		drive.driver(taxi); //택시가 달립니다.
		
		Truck truck = new Truck();
		drive.driver(truck);

	}

}
