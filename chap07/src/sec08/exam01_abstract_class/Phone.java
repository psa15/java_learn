package sec08.exam01_abstract_class;

//abstract키워드가 존재하므로, 추상클래스라고 함
//추상클래스의 목적은  상속! 객체생성 불가
public abstract class Phone {
	
	//field
	public String owner;
	
	//constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//method
	public void turnOn() {
		System.out.println("폰 전원 킴");
	}
	
	public void turnOff() {
		System.out.println("폰 전원 끔");
	}
	//지금까지 추상메소드 X
}
