package sec14.exam01_getter_setter;

public class CarExample {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		//private 접근 불가능
//		myCar.speed;
		
		myCar.setSpeed(-5); // myCar.speed = 5; 와 같은 의미
		
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
	}

}
