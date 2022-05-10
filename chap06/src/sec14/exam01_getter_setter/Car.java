package sec14.exam01_getter_setter;

public class Car {

	//필드
	//spring에서 필드는 private으로 하길 원함
	private int speed;
	private boolean stop; //false가 기본값
	
	//생성자
	
	//메소드
	//private인 필드를 읽고 쓸 수 있도록 public으로 만들기
	//private int speed 필드의 값을 읽기 위한 용도
	//다른 클래스에서 접근 가능하도록
	//getter메소드
	//get + speed = getSpeed()
	public int getSpeed() {
		return speed; 
	}
	
	//private int speed 필드의 값을 저장하기 위한 용도
	//저장을 목적으로 리턴값 X
	//setter메서드
	//set + speed = setSpeed()
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
		this.speed = speed;
		}
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0; //stop은 멈췄다는 의미이므로 연관되는 speed도 바꾸자
	}
	
	//get사용 X, is + stop = isStop()
	public boolean isStop() {
		return stop; 
	}
}
