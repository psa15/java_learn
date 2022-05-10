package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		// 참조타입: String 클래스
		//String 클래스: 문자열 데이터를 저장하고, 조작하는 기능
		
		/*
		1) 기본 타입 문법 유형
  		   String strVar1 = "김지원";
  		2) 참조 타입 문법 유형
  		   String strVar1 = new String("김지원");
        */
		
		//"김지원" 데이터가 저장되어 있는 주소를 재사용함
		String strVar1 = "김지원"; //힙영역에 "김지원"데이터가 저장되어 있는 주소를 대입
		// 힙영역에 "김지원" 데이터가 존재하는 지 여부를 검사 한 후, 존재하면 그 주소를 사용
		String strVar2 = "김지원";
		
		//String 클래스는 비교시 ==, equals() 메서드를 사용
		// == : 참조값으로 비교하는 기능
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2 참조가 다름");
		}
		
		//힙영역에 존재하는 데이터를 비교
		if (strVar1.equals(strVar1)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} else {
			System.out.println("strVar1과 strVar2는 문자열이 다름");
		}
		// new 기능: 힙영역에 메모리 생성
		String strVar3 = new String("김지원");
		String strVar4 = new String("김지원");
		
		//각각 힙영역에 메모리가 생성(문자열 데이터가 같은것은 상관 x)
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		//String 클래스를 참조타입 형식으로 사용해도 데이터 비교는 equals()메서드 사용
		if(strVar3.contentEquals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		} else {
			System.out.println("strVar3과 strVar4는 문자열이 다름");
		}
	}

}
