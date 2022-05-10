package sec01.exam01_primitivetype;

public class LongExample {

	public static void main(String[] args) {
		
		//★ 데이터 사용 시 숫자를 사용하면, int형 데이터로 인식
		
		//좌측의 기억장소가 long형, 우측의 값 10은 int형
		//int형 10이 long형으로 변환되어 값이 저장
		// 좌측의 기억장소 타입에 맞게 우측의 값을 표현! -> 자동 형 변환(묵시적 형 변환)
		long var1 = 10; //10 -> 10L 자동변환, 좌측 크기 > 우측 크기 ->에러 X
		long var2 = 20L;
		
		//100000000000값이 int형으로 바라보기 때문에 범위를 초과하여 에러발생
//		long var3 = 100000000000;
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		

	}

}
