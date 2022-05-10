package sec05.exam02_final_method;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	/*
	//오버라이딩 할 수 없음 final로 정의
	@Override
	public final void stop() {
		System.out.println("차 멈춤");
		speed = 0;
	}
	*/
}
