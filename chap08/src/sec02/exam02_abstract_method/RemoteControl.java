package sec02.exam02_abstract_method;

public interface RemoteControl {

	//상수
	int MAX_VOLUME = 10; //컴파일시 상수로 변환
	int MIN_VOLUME = 0;
	
	//abstract method
	void turnOn(); //컴파일 시 public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
}
