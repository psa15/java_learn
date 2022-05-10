package sec01.exam01_primitivetype;

public class FloatExample2 {

	public static void main(String[] args) {
		
		float num3 = 1.23456789f; //소수부분을 6자리까지 정확하게 표현

		double num4 = 1.23456789; // 소수부분을 15자리까지 정확하게 표현

		 

		System.out.println("float형  변수 num3 : " + num3);

		System.out.println("double형 변수 num4 : " + num4);
		
		//실수 데이터타입은 부호비트 + 가수비트 + 지수비트로 값 표현
		//오차가 발생
		//그 이상의 소수부분을 표현시 오차가 발생
		
	}

}
