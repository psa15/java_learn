package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {

	public C() {
		A a = new A();
		a.field1 = 1;
		//default는 다른 패키지에서는 private
//		a.field2 = 2;
		// private이라 에러
//		a.field3 = 3;
		
		a.method1();
		//default는 다른 패키지에서는 private
//		a.method2();
		// private이라 에러
//		a.method3();
	}
}
