package sec07.exam04_other_constructor;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	

	//메서드
	//생성자 호출은 객체 생성 구문에서 new 키워드 다음에 호출해야 한다
	/*
	 1) 클래스명 객체 = new 클래스();
	 2) 생성자 메서드 코드 안에서 다른 생성자 호출
	 */
	Car() {
		
	}
	
	Car(String model) {
		this(model, null, 0); //마지막 생성자를 가리킴
	}
	
	Car(String model, String color) {
		this(model, color, 0); // model, color는 위의 파라미터에서 값을 줌
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
