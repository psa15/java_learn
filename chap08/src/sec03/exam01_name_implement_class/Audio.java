package sec03.exam01_name_implement_class;

//RemoteControl 인터페이스의 추상메소드는 구현시 반드시 구현해야 한다.
public class Audio implements RemoteControl{

	//필드
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio 전원이 켜집니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off the Audio");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
	}

	
	

}
