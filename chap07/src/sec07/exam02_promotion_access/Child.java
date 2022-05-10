package sec07.exam02_promotion_access;

//자식클래스, 하위클래스, base class
public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("Child-method2");
//		super.method2();
	}
	
	public void method3() {
		System.out.println("Child-method3");
	}
	
//	public void method4() {
//		super.method2();
//	}
}
