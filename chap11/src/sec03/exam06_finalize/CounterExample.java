package sec03.exam06_finalize;

public class CounterExample {

	public static void main(String[] args) {
		
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			counter = null; //힙영역의 메모리참조를 제거
			System.gc(); //Garbage Collector 수동으로 호출 -> finalize() 매소드 호출됨
		}

	}

}
