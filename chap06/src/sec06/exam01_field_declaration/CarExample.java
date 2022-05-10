package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		
		//Car클래스의 구성요소에 해당하는 힙영역의 메모리생성
		// 생성된 메모리에 기본값이 타입별로 초기화
		Car myCar = new Car();
		

		//필드값 읽기(힙영역에 생성된 기억장소에 접근) -> myCar.___
		System.out.println("제작 회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("변경 속도: " + myCar.speed);
	}

}
