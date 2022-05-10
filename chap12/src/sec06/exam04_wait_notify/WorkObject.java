package sec06.exam04_wait_notify;

//공유자원에 해당하는 클래스
public class WorkObject/*extends Object*/ {

	public synchronized void methodA() {
		//임계영역: threadA가 methodA()를 실행하면 완료될 때까지 타 스레드 접근 X
		System.out.println("ThreadA의 methodA() 작업실행");
		notify(); //wait();로 일시정지된 스레드를 깨우는 기능(RUNNABLE 상태로 변경해줌)
		//처음에는 일시정지된 스레드가 없기 때문에 내려감
		
		//wait()
		//공유 메서드에 대하여 선점한 메서드는 자동으로 락을 갖게 되는데, wait()에 의해 락이 풀려 대기상태로
		//현재스레드의 락을 대기상태로 돌려준다
		//threadA스레드 객체가 cpu점유가 해제된다(일시정지) -> methodA의 for문이 반복되지 않게 해줌 -> methodB()가 cpu점유를 받게되어 sysout출력
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
		notify();
		//methodA스레드의 wait()상태를 해제시켜줌 그리고 밑으로 내려가서 methodB스레드는 wait() 메소드로 인해 일시정지 상태됨
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
