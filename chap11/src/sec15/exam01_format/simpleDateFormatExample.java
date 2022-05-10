package sec15.exam01_format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy. MM. dd a HH:mm:ss"); //2022. 05. 06 오후 12:51:09
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날"); //올해의 126번째 날
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 d번째 날"); //이달의 6번째 날
		System.out.println(sdf.format(now));
	}
}
