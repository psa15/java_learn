package sec02.exam01_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {

		//Arrays 클래스: 배열 기능을 지원하기 위한 목적
		List<String> list1 = Arrays.asList("홍길동","김선형","신용권");
		
		for(int i = 0; i < list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(str);
		}

		//향상된 for문
		System.out.println();
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {//원래 Integer형인데 알아서 int형으로 변환
			System.out.println(value);
		}
	}

}
