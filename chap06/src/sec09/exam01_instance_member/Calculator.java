package sec09.exam01_instance_member;

public class Calculator {
	
	//인스턴스 멤버: 데이터 타입 앞에 static X
	//특징: new 키워드가 메모리 생성할 때 사용됨
	
	//필드
	double pi = 3.14159;
	
	//메소드
	int plus(int x, int y) {
		return x + y;
	}
	
	int multiply(int x, int y) {
		return x * y;
	}
}
