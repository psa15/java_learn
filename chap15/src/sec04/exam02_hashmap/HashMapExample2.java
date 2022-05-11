package sec04.exam02_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//Key가 중복될 수 없으므로 Student클래스의 hashCode(), equals() 메소드 재정의를 통한 동일객체로 처리
		map.put(new Student(1,"김지원"), 95);
		map.put(new Student(1,"김지원"), 95);
		
		System.out.println("총 entry 수: " + map.size()); //총 entry 수: 1

	}

}
