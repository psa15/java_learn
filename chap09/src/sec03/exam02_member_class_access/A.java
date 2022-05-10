package sec03.exam02_member_class_access;

//바깥 필드와 메소드에서의 사용 제한
public class A {
	//인스턴스 필드: 메모리 생성(=사용하고 있다)
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		//지역변수 선언
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적 필드 초기화
//	static B field3 = new B(); //에러
	static C field4 = new C();
	
	//정적 메소드
	static void mehtod2() {
//		B var1 = new B(); //에러
		C var2 = new C();
	}
	
	//클래스는 메모리생성(객체) 설계도이다.
	//중첩클래스
	//1)인스턴스 멤버 클래스
	class B {}
	//2)정적 멤버 클래스
	static class C {}
	
}
