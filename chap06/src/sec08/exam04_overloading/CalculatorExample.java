package sec08.exam04_overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10); //10 -> 10.0 형변환 후 대입
		System.out.println("정사각형의 넓이는?: " + result1);
		
		//직사각형 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 5);
		System.out.println("직사각형의 넓이는?: " + result2);

	}

}
