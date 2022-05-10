package sec02.exam01_nestedclass_object;

public class A {
	//필드
	
	//객체 선언 및 생성
	// 선언: stack 영역만 사용
	// 생성: 힙 영역포함 사용
//	B b = new B();
	
	//중첩 클래스 선언
	//인스턴스 멤버 클래스
	public class B {
		//구성요소 사용 제한
		//생성자
		B() {System.out.println("B객체가 생성됨");}
		//인스턴스 멤버
		int field1;
		//메소드
		void method1() {}
		
		//static X
//		static int field2;
//		static void method2();
	}
	//정적멤버 클래스: 구성요소- 인스턴스, 정적 모두 가능
	static class C {
		C() {System.out.println("C객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	//메소드 내부에서 선언한 필드(지역변수)는 메소드 사용시 기억장소 생성, 메소드 사용 끝나면 소멸
	//메소드 내부에 클래스 선언
	void method() {
		//로컬클래스: 인스턴스만 가능
		class D {
			D() {System.out.println("D객체가 생성");}
			int field1;
//			static int field2;
			void method1() {}
//			static void mehtod2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
