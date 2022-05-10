package demo;

public class MemberMain {

	public static void main(String[] args) {
		//클래스는 참조타입이다 -> 기억장소를 생성하는 목적
		//클래스사용법: 클래스명 이름 = new 클래스이름();
		//obj: 붕어빵(객체)
		Member obj = new Member(); //메모리 구조
		obj.name = "홍길동";
		obj.age = 100;

		Member obj2 = new Member();
		obj2.name = "김지원";
		obj2.age = 30;
	}

}
