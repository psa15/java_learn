package sec02.exam01_parent_constructor_call;

public class Student extends People {

	//자식클래스에서 부모클래스의 매개변수가 있는 생성자를 호출하기 위한 매개변수 생성자를 가지고 있어야 함
	public Student(String name, String ssn) {
		super(name, ssn);
		
	}

}
