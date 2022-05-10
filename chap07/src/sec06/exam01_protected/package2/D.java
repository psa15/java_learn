package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

//A클래스를 상속받음
public class D extends A{ //서로 다른 패키지 이므로 import 삽입
	public D() {
		//다른 패키지의 A클래스 필드, 메소드 사용
		//A클래스의 생성자가 default가 되면 접근 불가(상속은 가능)
		this.field = "value";
		this.method();
	}

}
