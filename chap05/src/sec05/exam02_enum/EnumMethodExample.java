package sec05.exam02_enum;

public class EnumMethodExample {

	public static void main(String[] args) {

		/*
		 열거형(열거타입) : 참조타입
		 기억장소를 생성
		 열거형으로 생성한 기억장소는 정해진 값만 저장하고자 하는 목적
		 */
		//Week today: 스택영역에 주소를 참조하기위한 메모리 생성
		//today = Week.FRIDAY; : 힙영역에 Week.FRIDAY 값이 저장되어 있는 주소를 대입
		Week today = Week.FRIDAY; 
		
		//열거형 상수값에 해당하는 이름을 반환
		String name = today.name(); //이름
		System.out.println(name); //FRIDAY
		
		//today변수의 열거형 값의 목록순서
		int ordinal = today.ordinal();  //순서 반환
		System.out.println(ordinal); //4 (4번에 있음(0번부터 시작))

		//열거형 값의 상대적 차이
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSEDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//문자열 값을 열거형 값으로 변환시키는 기능 :
		String strDay = "FRIDAY";
		Week weekDay = Week.valueOf(strDay);
		
		if(weekDay == Week.FRIDAY) {
			System.out.println("오늘은 그묘일~~");
		}
		
		Week[] days = Week.values();
		
		for(int i = 0; i < days.length; i++) {
			System.out.println(days[i]);
		}
		
		for (Week day : days) {
			System.out.println(day);
		}
		
	}

}
