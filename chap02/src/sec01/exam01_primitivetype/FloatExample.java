package sec01.exam01_primitivetype;

public class FloatExample {

	public static void main(String[] args) {
		
		//실수값이란? 소수점을 포함한 숫자를 말한다.
		double var1 = 3.14;
		
		//3.14값을 double형으로 인식하기 때문에 
		//좌측의 float형으로 만든 기억장소에 값을 대입할 수 없다
//		float var2 = 3.14;
		float var3 = 3.14F;
		
		/*
		 정수형 데이터 기억장소의 데이터 표현 방식과 
		 실수형 데이터 기억장소의 데이터 표현방식이 다르기 때문
		 
		 정수형 데이터타입의 값 범위보다 실수형 데이터 타입의 범위가 커야 한다는 기준을 정해놓음
		 */
		//정밀도 테스트
		double var4 = 0.1234567890123456789; //소수부분이 19자리
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4); //0.12345678901234568 17자리로 표현, 반올림됨
		System.out.println(var5);

		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6; //3 * 1000000.0
		float var8 = 3e6F;
		double var9 = 2e-3; //2 * 10의 -3승
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
