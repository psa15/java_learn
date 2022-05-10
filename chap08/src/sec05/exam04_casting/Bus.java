package sec05.exam04_casting;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("bus running");
	}

	public void checkFare() {
		System.out.println("승차요금 확인");
	}
}
