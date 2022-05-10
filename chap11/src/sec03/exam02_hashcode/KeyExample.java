package sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		/*
		 컬렉션 기능을 제공하는 클래스
		 컬렉션: 기억장소의 또다른 형태
		 HashMap<참조타입, 참조타입> : 참조타입 지정
		 HashMap<K,V> : K: 락커 번호 V: 락커에있는 물건??
		 */
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//put(): 저장하는 메소드
		//hashMap.put(키, 값);
		/*
		 * equals(), hashCode() 를 재정의하지 않으면 new Key(1) 구문은 실행시마다 다른 주소를 반환하기 때문에 읽기시 null 반환
		 */
		hashMap.put(new Key(1), "홍길동"); //new Key(1): 힙영역에 기억장소가 생성, 주소 반환 (100번지)
		hashMap.put(new Key(2), "이몽룡");
		
		//get(): 읽어오기
		String value = hashMap.get(new Key(1)); //제정의가 됐다면 new Key(1): 힙영역에 기억장소가 생성, 주소 반환 (100번지)
		String value2 = hashMap.get(new Key(2));
		System.out.println(value); //이몽룡 출력
		System.out.println(value2);
		/*
		 * HashMap<K,V> K는 중복된 값을 주면 안됨
		 * 이론적으로는
				hashMap.put(new Key(1), "홍길동");
				hashMap.put(new Key(1), "이몽룡");
			new로 기억장소를 새로 생성하여 주소가 다르기 때문에 다른곳!
		 	->Key클래스에 재정의된 equals(), hashCode() 를 주석처리하고 실행시키면 null출력 (다, get의 new도 다른 곳이라)
		 * 제대로 재정의 하면 new로 생성됐지만 hashMap컬렉션(?) 덕분에 같은 기억장소라고 인지되어 홍길동의 값이 지워지고 이몽룡으로 들어가게 됨
			-> new Key(1) 가 호출될때마다 재정의된 두 메소드가 실행
			new Key(n) : n값이 달라지면 다른 객체로 인식
		 */

	}

}
