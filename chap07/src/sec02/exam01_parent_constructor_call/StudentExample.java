package sec02.exam01_parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		
		//상속시 자식클래스의 디폴트생성자를 객체 생성시 호출하면, 상속때문에 부모클래스의 디폴트 생성자를 호출
		// -> 자식 클래스의 디폴트생성자 호출되어진다
		//즉, 부모생성자 호출 -> 자식 생성자 호출
		Student student = new Student("김지원", "123456-1234657");

	}

}
