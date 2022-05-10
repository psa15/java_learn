package sec03.exam03_tostring;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {

		Object obj1 = new Object(); //모든 데이터 유형이 저장 가능 (기본타입 또는 참조타입 모두 저장 가능)
		
		Date obj2 = new Date(); //날짜 기능 제공 클래스
		System.out.println(obj1.toString()); //java.lang.Object@15db9742 출력 -> @15db9742: 이러한 정보가 주소에 들어가 있는 것
		                                     //                             -> 결과가 Pbject클래스의 toString()메서드의 기본 기능
		System.out.println(obj2.toString()); //Tue May 03 12:33:59 KST 2022 출력
											 // 재정의 안된 옜아 모습: java.util.Date@______
	}

}
