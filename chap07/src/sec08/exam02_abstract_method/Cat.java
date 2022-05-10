package sec08.exam02_abstract_method;

//추상클래스를 상속받는 Cat클래스는 부모 추상클래스의 추상메소드를 반드시 구현해야 한다.
public class Cat extends Animal {

	//생성자
	public Cat() {
		this.kind = "포유류"; //상속받았으니까 kind 사용 가능
	}
	
	//구현(implement)
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}

}
