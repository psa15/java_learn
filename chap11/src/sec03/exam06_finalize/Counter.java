package sec03.exam06_finalize;

public class Counter {
	
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	//가비지컬렉터가 호출함
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize() 실행됨");
	}
}
