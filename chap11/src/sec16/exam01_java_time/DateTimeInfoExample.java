package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 " + now.getMonth() + "월 " + now.getDayOfMonth() + "일";
		
		System.out.println(strDateTime); //2022년 MAY월 6일
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {
			System.out.println("올해는 윤년");
		}else {
			System.out.println("올해는 평년"); //올해는 평년
		}

	}

}
