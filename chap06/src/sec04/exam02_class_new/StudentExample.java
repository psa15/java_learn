package sec04.exam02_class_new;

public class StudentExample {

	public static void main(String[] args) {
		// 참조타입 사용법
		// 참조타입명 변수 = new 참조타입명();
		Student s1 = new Student();
		System.out.println("s1변수가 Student 객체를 참조");
		
		Student s2 = new Student();
		System.out.println("s2변수가 Student 객체를 참조");
	}

}
