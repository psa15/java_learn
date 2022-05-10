package sec04.exam02_default_method;

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
	
	//개발된 후 유지보수 차원에서 기능이 추가될 때 만약 상속받은 클래스 몇개만 해당된다면 default, static 메소드로 선언하여 필요한 클래스만 재정의
	//구현 클래스 전부가 필요하면 추상 메소드로 선언
	//고객사 기능 추가
	default void change() {};
	
	
}
