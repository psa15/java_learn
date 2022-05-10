package sec08.exam01_method_declaration2;

public class Computer {

	//합계 기능 메소드
	void sum1(int[] values) {
		
		for(int i= 0; i < values.length; i++) {
			values[i] = (i + 1) * 10;
		}
	}
	
	//가변인수(배열과 같은 기능)
	//가변인수를 포함하여 파라미터를 여러개 사용시 주의사항
	//가변인수 파라미터는 맨 마지막에 사용
	int sum2(int... values) {
		int sum = 0;
		
		for(int i= 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum3(String str, int... values) {
		
		return 0;
	}
}
