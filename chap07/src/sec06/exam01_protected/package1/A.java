package sec06.exam01_protected.package1;

public class A {

	//같은 패키지인 경우는 protected는 public 반응(접근 가능)
	//다른 패키지에서 A 클래스를 사용하는 경우에는 protected는 private 반응(접근 불가능)
	
	//상속목적
	//다른 패키지에서 상속시 사용가능하게 할 경우에 protected
	//생성자가 default가 되면 상속은 가능하나 접근 불가.
	
	//필드
	protected String field;
	//생성자
	protected A() {}
	//메소드
	protected void method() {}
}
