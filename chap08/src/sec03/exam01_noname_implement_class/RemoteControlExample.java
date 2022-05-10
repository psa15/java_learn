package sec03.exam01_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		/*
		 1) 인터페이스는 상속(구현)된 클래스를 이용해야 한다. - 외부에서 객체생성하여 호출가능
		 	RemoteControl 인터페이스, Audio클래스(구현), Television클래스(구현)
		 */
		//인터페이스는 객체 생성 불가
		// RemoteControl rc = new RemoteControl();  X
		
		//2) 익명 구현 객체 - 일회성
		RemoteControl rc = new RemoteControl() {
			
			//추상메소드를 구현(재정의)한 메소드
			@Override
			public void turnOn() {
				System.out.println("test turnon");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("test turnoff");
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};

		rc.turnOn();
	}

}
