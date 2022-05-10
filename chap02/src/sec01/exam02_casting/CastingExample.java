package sec01.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		//강제 형 변환 (명시적 형 변환)
		//작은 데이터타입의 기억장소 = (작은 데이타 타입)큰 데이터 값
		
		//= 의 역할: 오른쪽에 있던 코드를 값으로 해석해서 좌측의 기억장소에 대입, 할당한다.
		
		int intValue = 100;
		long longValue = 500; // 500.0으로 자동 형 변환 일어남
		intValue = (int)longValue;
		System.out.println(intValue);

		//double -> int 강제 변환
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		
		System.out.println(intValue); //3.14를 int형으로 변환되면서 소수점 아래는 버려져 3 출력
	}

}
