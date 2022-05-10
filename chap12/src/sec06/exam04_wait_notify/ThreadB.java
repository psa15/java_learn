package sec06.exam04_wait_notify;

//스레드 클래스
public class ThreadB extends Thread {

	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	//스레드가 cpu점유를 받게되면 동작하는 메서드
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
