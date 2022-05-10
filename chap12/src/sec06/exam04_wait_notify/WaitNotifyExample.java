package sec06.exam04_wait_notify;

public class WaitNotifyExample {

	/*
	 wait(), notify()메서드를 사용하지 않을 경우는 methodA()문자열 또는 methodB()문자열이 for문에 의하여 연속적으로 출력이 되는 패턴을 보이지만
	 wait(), notify()메서드를 사용시에는 methodA()문자열 또는 methodB()문자열이 한번씩 교차하면서 출력되는 결과가 발생
	 */
	public static void main(String[] args) {

		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);

		threadA.start();
		threadB.start();
	}

}
