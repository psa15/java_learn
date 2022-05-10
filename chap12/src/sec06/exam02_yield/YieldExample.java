package sec06.exam02_yield;

public class YieldExample {

	public static void main(String[] args) {

		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		//threadA, threadB runable 상태
		
		//3초간 일시정지되는 스레드: main스레드
		//sleep 실행 전-실행대기상태: threadA, threadB
		//threadA, threadB 둘 중 한 스레드가 계속 출력이 됨
		try {	Thread.sleep(3000);	} catch (InterruptedException e) {}
		//3초 후 메인스레드도 실행대기상태
		threadA.work = false; //3초 후에 다시 실행되며 work가 false가 됨 -> Thread.yield()메소드 실행
		
		try {	Thread.sleep(3000);	} catch (InterruptedException e) {}
		threadA.work = true;
		
		try {	Thread.sleep(3000);	} catch (InterruptedException e) {}
		threadA.stop = true;
		threadB.stop = true;
		

	}

}
