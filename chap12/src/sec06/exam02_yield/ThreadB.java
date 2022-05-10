package sec06.exam02_yield;

public class ThreadB extends Thread{

	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB  작업내용");
			} else {
				Thread.yield(); //동일한 우선순위 스레드 또는 우선순위가 높은 스레드에게 양보
			}
		}
		System.out.println("ThreadB 종료");
	}
}
