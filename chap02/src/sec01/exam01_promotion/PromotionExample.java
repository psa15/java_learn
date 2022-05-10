package sec01.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 형 변환
		//좌측 = 우측 
		//우측의 데이터가 좌측의 크기에 맞게 변환되어 대입될 때를 말함
		//큰 데이터 타입 기억장소 = 작은 데이터 타입
		//값을 할당 시 (대입 시 ) 좌, 우측의 데이터 타입은 일치가 되어야 한다
		
		//1) 작은 정수형 -> 큰 정수형
		byte byteValue = 10;
		int intValue = byteValue; //int형 기억 장소 = byte값
		
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;

		System.out.println(longValue);
		
		//2)정수형 -> 실수형 변환
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
