package sec10.exam02_static_be_careful;

public class Car {
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달림");
	}

	//main메소드는 Car클래스의 구성요소가 아니다.
	//실행 시 main메소드는 떨어져 나와 car클래스와는 독립적으로 바라보기
	//JVM에서 main()호출하기 위해 클래스에 코딩해서 사용할 뿐
	// 실행만 해서 void
	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

	}

}
