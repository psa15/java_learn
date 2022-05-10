package sec13.exam03_field_method_access.package1;

public class B {

	//조건문, 반복문 등 실행문장은 메소드 같은 {} 안에서만 작성해야함
	//클래스 밑에는 필드, 생성자, 메소드 정도!
	public B () { //실행 문장 안에서는 메모리 생성을 해야함
		A a = new A();
		a.field1 = 1;
		a.field2 = 2;
		//private은 클래스가 다른 경우는 접근 X
//		a.field3 = 3;
		
		a.method1();
		a.method2();
		//private은 클래스가 다른 경우는 접근 X
//		a.method3(); 
	}
}
