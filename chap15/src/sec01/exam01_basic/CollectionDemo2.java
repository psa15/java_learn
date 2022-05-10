package sec01.exam01_basic;

import java.util.ArrayList;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// 제네릭 컬렉션:제네릭 지원 데이터 타입은 <참조타입>
		//제네릭: 타입이 필요한 곳, 예를 들면 메소드에서 보면 파라키터, 리턴타입을 개발자가 원하는 참조타입을 지정하여 사용 가능
		
		ArrayList<String> al = new ArrayList<String>();//기억장소의 데이터타입이 String클래스로 관리 
		al.add("홍길동");
		al.add("이몽룡");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(300);
		
		//기본데이터타입 시도
//		ArrayList<int> al3 = new 불가능
	}

}
