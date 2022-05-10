package sec07.exam01_why_default_method;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB-method1()실행");
	}
	
	//default method override O
	@Override
	public void method2() {
		System.out.println("MyClassB-method2()실행");
	}

	//부모인터페이스의 디폴트 메소드 호출하는 법?????
	public void method3() {
		//부모인터페이스.super.디폴트메소드명();
		MyInterface.super.method2();
	}
}
