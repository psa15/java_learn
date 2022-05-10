package sec08.exam02_abstract_method;

public abstract class Animal {

	//필드. 생성자, 메소드
	
	//필드
	public String kind;
	
	//method
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//abstract method
	public abstract void sound();
}
