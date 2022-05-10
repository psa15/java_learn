package sec01.exam03_accuracy;

public class FromIntToFloat {
	
	public static void main(String[] args) {
		
		//연산식에서 자동 타입변환
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		//같은 4byte지만 크기는 실수(float)가 정수(int) 보다 크다
		float num3 = num2; //묵시적 형 변환
		System.out.println(num3); //1.23456784E8 출력
		num2 = (int)num3;
		System.out.println(num2); //123456784 출력
		
		int result = num1 - num2;
		System.out.println(result); //0이 나와야 하는데 형 변환으로 인해 num2 값이 바뀌어 -4가 출력
	}
}
