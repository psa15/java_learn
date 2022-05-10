package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//부모 엔터페이스 변수로 구현된 객체를 대이받아 사용
		RemoteControl rc; //RemoteControl rc = new RemoteControl(); X 에러남
		rc = new Audio();
		rc.turnOn();
		rc = new Television();
		rc.turnOn();

	}

}
