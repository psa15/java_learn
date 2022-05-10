package sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		//순서가 존재, 인덱스로 관리, 중복데이터 허용
		list.add("Java"); //index 0
		list.add("JDBC"); //index 1
		list.add("Servlet/JSP"); //index 2
		list.add(2, "Database"); //index 2지정하고 값을 대입 -> 기존 2번 인덱스는 3번으로 밀려남
		list.add("MyBatis"); //index 4
		
		int size = list.size();
		
		System.out.println("총 객체수: " + size); //5출력
		System.out.println();
		
		//컬렉션 기억장소의 요소 데이터 읽기
		String skill = list.get(2);
		System.out.println("2: " + skill); //2: Database
		System.out.println();
		
		//List인터페이스를 구현한 ArrayList컬렉션 객체의 데이터를 모두 순서대로 출력
		for(int i =0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println();
		
		list.remove(2); //인덱스 - Database 삭제
		list.remove(2); // Servlet/JSP 삭제(Database가 삭제되어 3번이던 데이터가 2번으로)
		list.remove("MyBatis"); //값 MyBatis 삭제
		System.out.println("값 삭제");
		for(int i =0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
