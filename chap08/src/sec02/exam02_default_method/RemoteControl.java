package sec02.exam02_default_method;

public interface RemoteControl {
	
	//인터페이스의 구성요소는 모두 접근자가 public이다.
	/*
	 필드, 생성자, 일반메소드 사용 x (추상클래스와의 차이점)
	 */
	
	//상수
	int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0;
	
	//abstract method
	void turnOn(); 
	void turnOff();
	void setVolume(int volume);
	
	//default method
	//default는 접근 제한자 X
	//인터페이스는 일반 메소드를 사용할 수 없도록 설계를 하여 개발시 불편한 점을 해소하기 위해 디폴트메소드를 지원
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음 해제");
		}
	}
}
