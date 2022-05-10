package sec03.exam01_abstract_method_use;

public class Television implements RemoteControl {

	//필드
	private int volume; //Audio의 필드명과 같음(같은 용도여서)
	
	@Override
	public void turnOn() {
		System.out.println("Turn on the TV");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off the TV");
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
		System.out.println("현재 TV 볼륨: " + volume);
	}

}
