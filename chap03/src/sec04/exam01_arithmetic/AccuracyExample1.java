package sec04.exam01_arithmetic;

public class AccuracyExample1 {
	
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit; //number는 pieceUnit 때문에 7.0으로 자동 형변환됨 -> apple도 1.0으로 변환
		
		System.out.println("사과 한 개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + " 조각이 남는다."); //0.29999999999999993 조각이 남는다. 출력 이게 뭐람
		
	}

}
