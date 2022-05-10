package sec16.exam01_java_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) throws Exception {
		//단순 날짜형태 작업: Date, Calendar 클래스 사용
		
		//날짜 얻기
		LocalDate currDate = LocalDate.now(); 
		System.out.println("현재 날짜: " + currDate);
		
		//날짜 지정
		LocalDate targetDate = LocalDate.of(2024, 05, 10);
		System.out.println("지정날짜: " + targetDate);
		
		//시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재시간: " + currTime);
		
		//시간 지정
		LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
		System.out.println("지정 시간 : " + targetTime);
		
		//날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간: " + currDateTime);
		
		//날짜와 시간 지정
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
		System.out.println("지정 날짜와 시간: " + targetDateTime);
		
		//TimeZone: 각 국가의 현지시간 정보 확인
		ZonedDateTime utfDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("세계협정시: " + utfDateTime);
		
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("newyork협정시: " + newyorkDateTime);
		
		//특정 시점의 타임스탬프 얻기
		Instant instant1 = Instant.now();
//		System.out.println(instant1); //2022-05-06T06:11:13.726Z 현재 시간 정보
		//0.001초 동안 프로그램 실행이 일시정지된다.
		Thread.sleep(10); //0.001초 (1000 milisecond = 1 sec)
		//다시 동작하는 시간 가져오기
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1 faster");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant1 slower");
		}else {
			System.out.println("same");
		}
		System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
	}

}
