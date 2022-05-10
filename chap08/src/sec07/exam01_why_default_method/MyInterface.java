package sec07.exam01_why_default_method;

public interface MyInterface {

	//abstract method
	public void method1();
	
	//default method
	public default void method2() {
		System.out.println("MyInterface-method2()실행");
	}
}
