package sec04.exam01_arithmetic;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		//산술 연산자 +, -, /, %, *
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
//		double result6 = v1 / v2; // 2.5인데 v1, v2가 int 형이므로 2로 저장되었다가 double형을 만나 2.0 출력
		double result6 = (double)v1 / v2; 
		System.out.println("result6 = " + result6); //2.5출력 (v1이 double이기 때문에 v2가 자동으로 double형으로 변환)

	}

}
