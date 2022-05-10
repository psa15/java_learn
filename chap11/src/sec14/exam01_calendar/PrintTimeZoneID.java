package sec14.exam01_calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		//TimeZone: 각 국가의 시간을 상대적으로 계산할 때 사용, 현지의 시간을 알아오는 목적
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}

	}

}
