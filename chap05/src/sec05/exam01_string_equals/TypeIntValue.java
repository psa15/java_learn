package sec05.exam01_string_equals;

public class TypeIntValue {

	public static void main(String[] args) {
		
		//메서드 내부에서 변수를 선언하면, 반드시 초기값을 사용해야 함(규칙준수)
		// 기본 데이터 타입: 초기값
		int a;
		a = 10;
		System.out.println(a);
		
		//참조 데이터 타입: 초기값
		String str;
		str = null; //힙영역에 생성된 기억장소의 주소를 참조하지 않은 상태
		
		//참조타입의 객체(힙영역의 데이터)를 가지고 작업을 하고 싶다면 '객체.요소' 문법 사용
		//ex)str.length(); -> 지금은 null로 데이터가 없어서 에러 뜸
		
		//힙 영역의 기억장소의 주소를 참조하지 않은 상태, 즉, null 상태에서는 작업을 할 수가 없다.(= 명령어를 호출할 수가 없다)
//		str = "김지원";
//		str.length(); //str의 참조값에 "김지원"이라는 값을 줘서 에러 안남
		System.out.println(str);

	}

}
