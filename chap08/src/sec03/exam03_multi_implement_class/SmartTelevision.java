package sec03.exam03_multi_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

//인터페이스는 여러개를 구현(상속) 가능
public class SmartTelevision implements RemoteControl, Searchable {

	//field
	private int volume;


	@Override
	public void turnOn() {
		System.out.println("TV turn on");	
	}

	@Override
	public void turnOff() {
		System.out.println("TV turn off");
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
	
	@Override
	public void searchh(String url) {
		System.out.println("Searching Url");
		
	}

}
