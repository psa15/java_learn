package sec14.exam01_eclipse_getter_setter;

//이클립스에서 getter / setter 메서드 만들기
public class Car {

	//필드
	//spring에서 필드는 private으로 하길 원함
	private int speed;
	private boolean stop; 
	
	//getter / setter 위의 source메뉴 사용
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	//생성자
	public Car(int speed, boolean stop) {
		super();
		this.speed = speed;
		this.stop = stop;
	}
	

	

}
