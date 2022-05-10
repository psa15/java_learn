package sec07.exam01_why_default_method;

public class DefaultMethodExample {
	
	public static void main(String[] args) {
		
		//다형성
		MyInterface mi1 = new MyClassA();
		mi1.method1(); //MyClassA-method1()실행
		mi1.method2(); //MyInterface-method2()실행 -> 부모인터페이스의 디폴트 메소드 호출
		
		//부모인터페이스 변수로 자식 구현객체를 대입받는 구문
		MyInterface mi2 = new MyClassB();
		mi2.method1(); //MyClassB-method1()실행
		mi2.method2(); //MyClassB-method2()실행 -> 재정의된 디폴트메소드 호출
		
		//부모인터페이스 변수로 자식객체에서 선언한 메소드 접근 X
		//mi2.method3(); X 에러남
		
		//부모인터페이스 변수로 접근할 때 보이지 않는 멤버 호출시, 자식객체로 형변환 후 접근 가능.
		MyClassB mb = (MyClassB) mi2;
		mb.method3(); //MyInterface-method2()실행
		mb.method1(); //MyClassB-method1()실행
		mb.method2(); //MyClassB-method2()실행
	}
}
