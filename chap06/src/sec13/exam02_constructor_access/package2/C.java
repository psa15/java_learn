package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class C {

	//필드
	A a1 = new A(true);
	
	//default: 패키지가 달라서 private의 의미, 접근 불가
//	A a2 = new A(1);
	
	//private이므로 접근 불가
//	A a3 = new A("문자열");
}
