package sec05.exam07_printstream;

import java.util.Date;

public class PrintExample {

	public static void main(String[] args) {
		// 일반적으로
		int price = 123;
//		System.out.println("상품의 가격: " + price + "원");
		
		//더 편리하게 사용
		System.out.printf("상품의 가격: %d원\n", price); //int형 : %d  //상품의 가격: 123원
		System.out.printf("상품의 가격: %6d원\n", price);//6자리 오른쪽 정렬  //상품의 가격:    123원
		System.out.printf("상품의 가격: %-6d원\n", price); //6자리 왼쪽 정렬  //상품의 가격: 123   원
		System.out.printf("상품의 가격: %06d원\n", price);//빈자리 0으로 채움  //상품의 가격: 000123원
		
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, Math.PI*10*10); //실수형 데이터: %f //%10.2f: 소수부분 둘째자리 포함 10자리
		
		System.out.printf("%6d | %-10s | %10s\n",1,"김지원","딩이");//String: %s로 표현하고 기본적으로 오른쪽 정렬이어서 %-10s는 왼쪽정렬, -사용하면 자릿수 지정 필수
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.\n", now, now, now);
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다.\n", now); //1$: now 하나로 세개 다 사용하겠다 의 의미
		System.out.printf("현재 %1$tH시 %1$tM분 %1$tS초 입니다.\n", now);
	}

}
