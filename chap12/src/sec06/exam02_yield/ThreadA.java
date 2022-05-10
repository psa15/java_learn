package sec06.exam02_yield;

//yield(): while문이 무의미하게 반복되어 동작되는 경우 CPU의 저유를 타스레드에게 양보
public class ThreadA extends Thread{

	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			//else 구문이 없고 work변수가 false인 경우 while문이 무의미하게 반복되는 상황
			if(work) {
				System.out.println("ThreadA  작업내용");
			} else {
				System.out.println("ThreadA===================");
				Thread.yield(); //동일한 우선순위 스레드 또는 우선순위가 높은 스레드에게 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
}
