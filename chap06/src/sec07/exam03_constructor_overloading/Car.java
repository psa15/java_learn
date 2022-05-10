package sec07.exam03_constructor_overloading;

public class Car {
	
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//객체생성시 힙영역의 메모리에 값을 초기화하는 목적 - 생성자의 목적
	//생성자-힙영역에 기억장소가 생겼을 때 그 기억 장소에 원하는 값을 집어 넣고 싶을 때
	Car() {
		
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
