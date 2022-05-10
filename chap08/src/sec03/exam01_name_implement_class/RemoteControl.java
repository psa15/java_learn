package sec03.exam01_name_implement_class;

public interface RemoteControl {
	
	//인터페이스의 구성요소는 모두 접근자가 public이다.
	
	//1) 상수
	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;
	
	//2) abstract method
	void turnOn();  //전원 On
	void turnOff(); //전원 off
	void setVolume(int volume); //소리크기
	
	//3) default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	
	//4) static(정적) 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
