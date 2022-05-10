package sec04.exam02_default_method;

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

	//필드
	private boolean mute;
	
	//RemoteControl 인터페이스의 default 메소드 재정의
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println(" audio 무음처리");
		} else {
			System.out.println("audio 무음 해제");
		}
	}

	@Override
	public void change() {
		System.out.println("");
		
	}
	

}
