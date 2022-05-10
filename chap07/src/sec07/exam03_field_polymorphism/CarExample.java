package sec07.exam03_field_polymorphism;

//다형성
//하나의 객체가 여러가지 타입(형)을 갖게 되는 것을 의미
public class CarExample {

	public static void main(String[] args) {

		//객체 생성
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				// Tire(부모) 클래스 변수 = HankookTire(자식클래스)
				car.frontLeftTire = new HankookTire("앞왼쪽",12);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽",13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 13);
				break;
			case 4:
				System.out.println("뒤  오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			System.out.println("------------------------------");
		}

	}

}
