package sec02.exam02_static_method;
//파일을 복사해서 다른 패키지에 붙여넣기 하면 자동으로 패키지명이 바뀜

public interface RemoteControl {
	
	//인터페이스의 구성요소는 모두 접근자가 public이다.
	/*
	 필드, 생성자, 일반메소드 사용 x (추상클래스와의 차이점)
	 */
	
	//1) 상수
	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;
	
	//2) abstract method
	void turnOn(); 
	void turnOff();
	void setVolume(int volume);
	
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
