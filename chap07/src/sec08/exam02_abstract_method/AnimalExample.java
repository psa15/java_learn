package sec08.exam02_abstract_method;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();

		//필드 다형성
		Animal animal = null;
		animal = new Dog(); //부모클래스 변수에 자식객체 대입
		animal.sound(); //Animal 클래스에 sound() 내용이 없어서 Dog클래스의 sound()메소드 호출

		animal = new Cat(); //부모클래스 변수에 자식객체 대입
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());

		}
	//매개변수 다형성
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
