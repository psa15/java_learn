package sec04.exam03_compare;

public class CompareOperatorExample2 {
	
	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		//int형 v2변수가 double형으로 변환되고, 비교가 가능해짐.
		System.out.println(v2 == v3); //타입일치
		
		//실수형 타입은 부동소수점 방식으로 값을 표현하기 때문에 원래 저장될 때 입력하는 값 그대로 저장 X
		//정밀도가 떨어지는 부정확한 형태로 저장
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);//v5가 double형으로 변환되지만 값은 false
		//소수부분을 버리고 정수형으로 변환되어 비교가 발생되므로 true
		System.out.println((int)(v4*10) == ((int)(v5*10))); //true
		//v4변수를 float변환시 6자리까지는 유효한 범위에 해당(정확한)되므로 v5변수가 가지고 있는 값의 6자리까지는 같기 때문에 true 출력
		System.out.println((float)v4 == v5); //true
	}

}
