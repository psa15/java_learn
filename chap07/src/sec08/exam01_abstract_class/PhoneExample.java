package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		
		//추상클래스로 new로 객체 생성 -> X 에러남
//		Phone phone = new Phone("나의 폰");
		
		//상속받은 클래스는 객체 생성 가능
		SmartPhone smartPhone = new SmartPhone("my phone");
		smartPhone.turnOn();
	}

}
