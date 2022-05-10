package sec08.exam01_method_declaration;

public class Calculator {
	
	//메소드: 기능구현을 위한 코드들의 집합체
	//재사용성
	/*
	 기본 구문
	 메소드 작성법
	 1) 리턴값이 있는 메소드
	 리턴타입 메소드명(파라미터1, 파라키터2,...) {
	 	
	 	return 리턴타입; //타입일치 필요
	 	}
	 2) 리턴값이 없는 메소드
	 void 메소드명(파라미터1, 파라미터2, ...){
	 
	 }
	 */
	
	//리턴타입 X, 파라미터 X
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	// 두 수의 합한 값의 타입 = 리턴타입
	int plus(int x, int y) {
		int result = x + y;
		return result; //result의 타입과 plus앞의 타입이 일치 혹은 자동타입변환이 되면 가능
	}
	
	//리턴타입 강제 형 변환
//	int plus (int x, int y) {
//		int b = 0;
//		return (byte)b;
//	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}

