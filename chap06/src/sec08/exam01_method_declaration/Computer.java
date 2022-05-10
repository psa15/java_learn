package sec08.exam01_method_declaration;

public class Computer {

	//합계 기능 메소드
	//뼈대를 먼저 작성 , sum1이 int형이기 때문에 return 0; 으로 뼈대를 세워 에러를 일단 없애 확인
	int sum1(int[] values) {
		int sum = 0;
		
		for(int i= 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//가변인수(배열과 같은 기능)
	int sum2(int... values) {
		int sum = 0;
		
		for(int i= 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
