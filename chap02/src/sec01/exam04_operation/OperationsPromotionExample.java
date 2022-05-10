package sec01.exam04_operation;

public class OperationsPromotionExample {
	
	public static void main(String[] args) {
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; //변수이기 때문에 나중에 값이 바뀔 수 있어서 범위가 넘어설 수 있기 때문에 에러가 남
		//바이트 변수끼리 연산시 오버플로우 문제로 바이트변수에 값을 저장 X
		
		//int데이터타입 범위가 크기 때문에 영향을 받지 않는다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드값: " + intValue2); //66 출력
		System.out.println("출력문자: " + (char)intValue2); //B출력
		
		int intValue3 = 11;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4); //2 출력
		
		int intValue5 = 10;
		double intValue6 = intValue5 / 4.0;
		System.out.println(intValue6);
	}

}
