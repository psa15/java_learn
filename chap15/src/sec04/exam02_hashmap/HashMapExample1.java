package sec04.exam02_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {

		//객체 생성
		//Integer : Wrapper클래스
		Map<String, Integer> map = new HashMap<String, Integer>();

		//객체추가
		map.put("김지원", 35);//key중복
		map.put("염미정", 86);
		map.put("염기정", 90);
		map.put("김지원", 95); //key중복, key가 중복되면 나중에 처리한 것이 적용됨
		
		System.out.println("총 Entry 수: " + map.size()); //총 Entry 수: 3
		//key 중복 X, 중복되는 값 빠짐
		
		//객체 읽기(찾기)
		System.out.println("\t김지원: " + map.get("김지원")); //김지원: 95
		//중복되는 키객체 중 마지막에 들어온 값객체 출력 
		
		System.out.println("map -> set");
		
		//객체를 하나씩 처리 map -> set
		Set<String> keyset = map.keySet(); //map에 있는 데이터들을 set의 형태로 가져옴
		Iterator<String> keyIterator = keyset.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //key를 읽어옴
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println("map으로 출력");
		
		//map으로 출력
		//map.entrySet() : map컬렉션 구조의 key:value 쌍으로 되어있는 구조(map.entry)들을 Set(집합)으로 모아놓은 컬렉션
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next(); //entry 구조를 가져옴
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry[Key:Value] 수: " + map.size());
		
	}

}
