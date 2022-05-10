package sec07.exam03_field_polymorphism;

public class HankookTire extends Tire {

	//Tire클래스의 생성자가 수동 생성자라(default 생성자가 아니라)에러가 나기 때문에 밑에 추가
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); //Tire클래스(부모클래스)의 생성자 호출
		//default 생성자는 super(); 이렇게만 추가되어 자동 생성됨
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		//타이어의 최대회전수가 누적회전수보다 작으면 양호
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크***");
			return false;
		}
	}

	
}
