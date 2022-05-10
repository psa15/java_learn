package sec02.exam01_nestedclass_object;

public class Main {

	public static void main(String[] args) {
		// 중첩 클래스를 가지고 있는 클래스(A클래스) 사용법
		A a = new A();
		
		//중첩클래스: 인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();

		//중첩클래스: 정적멤버 클래스 객체생성
		A.C c = new A.C();
		//instance
		c.field1 = 3;
		c.method1();
		//static
		A.C.field2 = 3;
		A.C.method2();
		
		//로컬 클래스 객체생성을 위한 메소드 호출
		a.method();
	}

}
