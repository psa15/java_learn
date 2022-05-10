package sec14.exam01_calendar;

import java.util.Calendar;

public class CalenderExample {

	public static void main(String[] args) {
		//추상클래스의 객체 사용구문
		//추상클래스명 변수 = 추상클래스.getInstance();
		Calendar cal = Calendar.getInstance(); //현재시스템의 날짜를 참조

		int year = cal.get(Calendar.YEAR); //년도
		int month = cal.get(Calendar.MONTH)+ 1; //월: 0~11까지의 값이어서 + 1
		int day = cal.get(Calendar.DAY_OF_MONTH); //일
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일정보 1 ~ 7출력(0:일요일)
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY:
				strWeek = "일";
		}
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.print(day + "일");
		System.out.println(strWeek + "요일");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.println(second + "초");
	}

}
