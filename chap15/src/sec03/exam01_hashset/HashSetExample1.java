package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		//주머니에 공이 저장되는 이미지를 생각
		//저장되는 데이터의 순서가 유지 X
		//데이터 중복 허용 X
		//null은 한 번 가능
		
		Set<String> set = new HashSet<String>();
		
		//데이터 저장(추가)
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //중복
		set.add("MyBatis");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size); //중복 허용X로 4 출력

		//개별 데이터 읽기 지원 X ->순서가 없어서 어떤 데이터를 읽을지 몰라서
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //현재 위치에 데이터가 존재하면 true
			String element = iterator.next(); //현재 위치의 데이터읽어오고 커서를 다음 위치로 이동
			System.out.println("\t" + element);
		}
		
		//값 제거
		set.remove("JDBC");
		set.remove("MyBatis");
		System.out.println("총 객체 수 : " + set.size());
		
		//향상된 for문
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		//전체 데이터 삭제
		set.clear();
		if(set.isEmpty()) { //.isEmpty() : 비어있으면 true
			System.out.println("empty!");
		}
	}
	
	

}
