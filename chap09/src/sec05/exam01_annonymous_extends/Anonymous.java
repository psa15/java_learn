package sec05.exam01_annonymous_extends;

public class Anonymous {
	//일반적으로 사용
	Person ps = new Person();
	
	//익명 자식객체 생성. 인터페이스의 익명객체와 비슷함
	//1) 필드 초기값으로 대입
	Person field = new Person() {
		void work() {
			System.out.println("go to work");
		}
		@Override
		void wake() {
			System.out.println("6 o'clock wake up");
			work();
		}
	};
	//2) 메소드 내부에서 지역변수 수준 
	void method1() {
		//메소드 내에서 지역변수 수준으로 익명객체가 생성 - 1회성
		Person localVar = new Person() {
			void walk() {
				System.out.println("go for a walk");
			}
			
			@Override
			void wake() {
				System.out.println("7 o'clock wake up");
				walk();
			}
		};
		
		//로컬변수 사용- 익명객체 이름 사용
		localVar.wake();
	}
	//3)파라미터 수준
	void method2(Person person) {
		person.wake();
	}
	
}
