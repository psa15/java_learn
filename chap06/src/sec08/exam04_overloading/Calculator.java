package sec08.exam04_overloading;

public class Calculator {

	//메소드 오버로딩(중복 정의): 하나의 클래스에서 동일한 메소드명을 만들 수 있는 규칙
	//조건: 파라미터의 개수, 타입, 순서가 다르게
	//리턴타입은 상관 X
	
	//정사각형의 넓이 
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
