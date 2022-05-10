package sec04.exam02_default_method;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//부모 엔터페이스 변수로 구현된 객체를 대이받아 사용
		RemoteControl rc; //RemoteControl rc = new RemoteControl(); X 에러남
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Television();
		rc.turnOn();

	}

}
