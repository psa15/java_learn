package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("김지원", 30)); //new Member의 리턴값이 같게 ??
		set.add(new Member("김지원", 30));
		
		System.out.println("총 객체수: " + set.size());

	}

}
