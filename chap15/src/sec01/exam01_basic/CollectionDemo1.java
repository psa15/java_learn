package sec01.exam01_basic;

import java.util.ArrayList;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// 컬렉션 기능을 제공하는 클래스류: 컬렉션 프레임워크
		//전통 컬렉션: Object 클래스로 데이터 관리
		//데이터 저장 시 기억장소가 자동추가 생성되어 관리, 배열과 비교
		
		ArrayList al = new ArrayList();
		
		al.add("홍길동");
		al.add(10);
		al.add(3.14);
		al.add(new Family());
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));

	}

}

class Family{
	
}
