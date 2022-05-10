package sec03.exam04_clone;

public class MemberExample {

	public static void main(String[] args) {

		//원본 객체 생성
		Member original = new Member("blue", "Kimgeewon", "12345", 25, true);
		
		//객체복사 메서드 호출
//		original.getMember(); getMember() 리턴타입이 Member니까 ->
		Member cloned = original.getMember(); // 얕은복사: cloned객체의 기본타입은 새로운 기억장소 생성, 참조타입은 문자열데이터의 기억장소의 주소만 복제
		
//		Member cloned2 = original; //original의 주소를 cloned2에 대입, 8번라인의 힙영역에 생성된 기억장소를 공유

		cloned.age = 100;//새롭게 기억장소가 생성됐느지 확인 제대로 됐다면 cloned만 100, orginal은 25
		cloned.name = "김지원"; //새로운 기억장소가 cloned.name에 의해 생성됨
		//cloned.name에는 김지원의 주소가, original.name에는 Kimgeewon의 주소가 여전히 남아 있는 것 뿐
		System.out.println("[cloned object field]");
		System.out.println("id:  " + cloned.id);
		System.out.println("name:  " + cloned.name);
		System.out.println("password:  " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[original object field]");
		System.out.println("id:  " + original.id);
		System.out.println("name:  " + original.name);
		System.out.println("password:  " + original.password);
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}

}
