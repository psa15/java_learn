package sec07.exam05_method_polymorphism;

public class Drive {
	//메서드의 파라미터를 부모클래스로 사용
	//Vehicle vehicle 파라미터가 핵심
	//나중에 호출시 drive(파라미터)의 파라미터가 뭐가 나오냐에 따라 출력문이 달라짐
	public void driver(Vehicle vehicle) {
		vehicle.run(); //Vehicle 클래스의 run()
	}
}
