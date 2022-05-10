package sec05.exam02_final_method;

public class Car {

	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final method
	public final void stop() {
		System.out.println("차 멈춤");
		speed = 0;
	}
}
