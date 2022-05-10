package sec02_runtime_exception;

//java.lang.ClassCastException: 형변환시 예외발생
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog); //형변환 가능
		
		Cat cat = new Cat();
		//cat이라는 객체가 changeDog()메소드의 파라미터인 animal과는 상관이 있으나 Dog와는 관련이 없어서
		changeDog(cat);  //에러

	}
	
	public static void changeDog(Animal animal) {
		//형변환 메소드
		//instanceof: 타입확인 연산자
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}

//별도로 만들기 귀찮아서 여기에 ㅎ
//bin폴더에 클래스 각각 .class라는 확장자명의 바이트코드파일 생성됨
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
