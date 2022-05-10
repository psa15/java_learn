package sec14.exam01_calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//TimeZone ID 사용
public class CalTimeZoneExample {

	public static void main(String[] args) {
		TimeZone time;
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (z Z)");
		
		time = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(time);
		System.out.println(time.getDisplayName());
		System.out.println(df.format(date));
		
		System.out.println();
		
		time = TimeZone.getTimeZone("Asia/Tokyo");
		df.setTimeZone(time);
		System.out.println(time.getDisplayName());
		System.out.println(df.format(date));
		

	}

}
