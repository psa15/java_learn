package sec06.exam06_stop;

//boolean 변수를 이용하여 스레드의 반복문 조건식에 영향을 주어 종료하도록 해야 함
public class PrintThread1 extends Thread {
	
	private boolean stop; //객체생성시 기본값은 false
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) {//stop의 기본값이 false니까 !stop -> true
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
