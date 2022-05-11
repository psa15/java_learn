package sec02.exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		/*
		 끝에서부터 (순차적으로) 데이터를 추가/삭제 하는 경우는 ArrayList가 빠르다 -> 나는 왜 LinkedList가 빠르지
		 중간에 추가 또는 삭제할 경우는 앞, 뒤 링크정보만 변경하면 되는 LinkedList가 더 빠르다
		 */
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		//list1: ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<1000; i++) {
			list1.add(0,String.valueOf(i)); 
			//계속 데이터를 추가시킬건데 인덱스0번에 추가되어 전에 추가된 객체는 인덱스번호가 뒤로 밀림 -> 0이 제일 마지막 인덱스에 들어갈거임
		}
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 작업시간: " + (endTime - startTime) + "ns");
		
		//list2: LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<1000; i++) {
			list2.add(0,String.valueOf(i)); 
			//계속 데이터를 추가시킬건데 인덱스0번에 추가되어 전에 추가된 객체는 인덱스번호가 뒤로 밀림 -> 0이 제일 마지막 인덱스에 들어갈거임
		}
		endTime = System.nanoTime();
		
		System.out.println("LinkedList 작업시간: " + (endTime - startTime) + "ns");

	}

}
