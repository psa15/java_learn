package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

	public static void main(String[] args) {

		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
//		localDate = LocalDate.parse("2024/05/21"); //예외발생 '/', '.' 지원 X
		
		System.out.println(localDate); //2024-05-21
		
		//-가 아닌 /나 .이 들어오면 변경
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate); //2024-05-21
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);

	}

}
