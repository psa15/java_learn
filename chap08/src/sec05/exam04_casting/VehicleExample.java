package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		//접근불가
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();

	}

}
