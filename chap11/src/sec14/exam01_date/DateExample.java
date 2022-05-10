package sec14.exam01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		//Date클래스: 날짜기능을 제공
		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1); //Fri May 06 11:41:58 KST 2022 / KST: 한국날짜표준포맷
		
		//출력날짜 형식 지정 클래스: SDF(SimpleDateFormat)
		//날짜 형식 패턴문자: MM은 월 mm은 분
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //2022년 05월 06일 11시 47분 55초
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); //2022/05/06
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
