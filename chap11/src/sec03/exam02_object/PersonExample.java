package sec03.exam02_object;

public class PersonExample {

	public static void main(String[] args) {

		Person ps1 = new Person("홍길동", "123456-1234567");
		Person ps2 = new Person("홍길동", "123456-1234567");
		
		System.out.println("ps1과 ps2는 동일한 객체(사람)인가요? " + (ps1.equals(ps2)));


	}

}
