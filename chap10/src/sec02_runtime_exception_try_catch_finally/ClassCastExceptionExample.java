package sec02_runtime_exception_try_catch_finally;

//java.lang.ClassCastException: 형변환시 예외발생
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		try {
			Dog dog = (Dog) animal; //exception 발생
		} catch (ClassCastException ex) {
//			ex.printStackTrace(); //콘솔에 예외오류정보 출력
			System.out.println("오류발생");
		}
			
	
	}

}

//별도로 만들기 귀찮아서 여기에 ㅎ
//bin폴더에 클래스 각각 .class라는 확장자명의 바이트코드파일 생성됨
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
