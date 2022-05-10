package sec07.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		//상속관계시 형변환 예제
		/* 현재 클래스 상속관계
		 			A
		 		B		C
		 		D		E
		 */

		//객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//묵시적 형변환, 타입 일치
		// 좌측의 데이터타입이 우측의 타입으로 변환되어 주소가 대입
		A a1 = b; //b가 A로 형변환 되어 b의 주소가 a1의 주소로 대입
		A a2 = c; 
		A a3 = d; //d가 b의 자식이고 b가 A의 자식이라(수직)
		A a4 = e;
		
		B b1 = d;
		
		C c1 = e;
		
		//뭣도 관계없어서 X
//		B b2 = e; 
//		C c2 = d;
	}

}
