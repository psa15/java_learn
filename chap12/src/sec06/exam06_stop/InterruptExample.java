package sec06.exam06_stop;

public class InterruptExample {

	public static void main(String[] args) {
		
		Thread thread = new PrintThread2(); 
		//PrintThread2클래스에는 가져올 필드가 없음
		//PrintThread2 printThread2 = new PrintThread2(); X
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
