package sec13.exam02_constructor_access.package1;

public class A {

	//생성자
	public A(boolean b) {}
	A(int b) {} //접근자 생략 = default 의미로 해석
	private A(String s) {}
	
	//필드
	//같은 클래스 내부에서는 접근자의 의미가 없다.
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
}
