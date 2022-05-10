package sec07.exam03_field_polymorphism;

public class EzenTire extends Tire {

	//Tire클래스 상속받지 않으면 
	//car.frontLeftTire = new EzenTire("앞왼쪽",12); 사용 불가, 
	//car.frontLeftTire랑 관련이 없어서 에러남 
	public EzenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	

}
