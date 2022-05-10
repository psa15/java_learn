package sec03.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		//참조타입: 클래스, 인터페이스, 열거, 배열
		//부모 엔터페이스 변수로 구현된 객체를 대이받아 사용
		RemoteControl rc = null;
		
		//다형성 polymorphism
		rc = new Television(); //rc에는 Television객체의 주소가 들어감
		rc.turnOn();
		rc.turnOff(); //부모인터페이스로 받았으나 Television클래스의 turnOff()메소드로 받음
		
		rc = new Audio(); //rc에는 Audio객체의 주소가 들어감(Television객체의 주소는 사라짐)
		rc.turnOn();
		rc.turnOff();

	}

}
