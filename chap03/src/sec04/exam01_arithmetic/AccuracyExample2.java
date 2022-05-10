package sec04.exam01_arithmetic;

public class AccuracyExample2 {
	
	public static void main(String[] args) {
		
		//정수형 데이터타입과 실수형 데이터타입은 값을 표현하는 방식이 다르다.
		//정수형 데이터타입은 데이터 크기만큼 부호비트 1개 와 나머지 비트로 값을 표현
		//실수형 데이터타입은 부호비트1개, 가수부와 지수부로 값을 표현하여 값이 정확하지 않은 근사치 값으로 관리되어 정밀도 존재.
		
		int apple = 1;
		int totalPieces = apple * 10;
		int number = 7;
		int temp = totalPieces - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한 개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + " 조각이 남는다."); 
		
	}

}
