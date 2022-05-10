package sec04.exam01_unsynchronized;

public class MainThreadExample {

	public static void main(String[] args) {

		//공유자원 Calculator클래스 객체 생성
		Calculator calculator = new Calculator();
		
		//스레드 user1 객체 생성(스레드 user1: User1클래스 자체가 Thread클래스를 상속했기 때문에) 
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start(); //일단 대기 상태 ->CPU점유 ->User1클래스의 run()메소드 호출
		
		//스레드 user2 객체 생성
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start(); //일단 대기상태

	}

}
