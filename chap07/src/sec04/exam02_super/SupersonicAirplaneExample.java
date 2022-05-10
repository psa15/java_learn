package sec04.exam02_super;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();//누구소속인지 확인 필수! -> 자식클래스의 fly()임
		sa.flyMode = SupersonicAirplane.SUPERSONIC; //SUPERSONIC으로 바꾸었기 떄문에 sa.fly(); 하면 초음속비행
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();

	}

}
