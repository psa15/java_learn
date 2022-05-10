package sec06.exam03_join;

//1~100까지 누적값을 구하는 스레드 클래스
public class SumThread extends Thread {

	//filed
	private long sum;
	
	//method
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
