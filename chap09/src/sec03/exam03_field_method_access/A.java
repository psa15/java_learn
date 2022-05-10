package sec03.exam03_field_method_access;

//멤버 클래스에서 사용제한
public class A {

	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method( ) {
			//instance member X - 객체 생성을 해야만 메모리 생성 가능
//			field1 = 10;
//			method1();
			
			//static member O
			field2 = 10;
			method2();
		}
	}
}

