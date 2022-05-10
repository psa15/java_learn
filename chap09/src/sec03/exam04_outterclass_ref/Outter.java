package sec03.exam04_outterclass_ref;

//중첩클래스에서 바깥클래스 참조 얻기
public class Outter {
	String field = "Outter-field"; //변수명이 중첩클래스와 같음
	void method() {
		System.out.println("Outter-method()");
	}
	
	//중첩클래스: 인스턴스
	//중첩클래스 내부에서this는 중첰클래스 자신을 가리킴
	//중첩클래스에서 바깥 멤버를 참조시 바깥클래스명.this로 가리킴
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method()");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			//밖에 있는 Outter의 필드와 메소드 호출
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
