package sec06.exam03_join;

//누적된 합을 출력하고자 하는 클래스
public class JoinExample {

	public static void main(String[] args) {


		SumThread sumThread = new SumThread();
		sumThread.start(); //runnable

		//방법1) 시간으로 제어 -> XXXXXXXX 안좋음
//		try {
//			Thread.sleep(1000); 
//		} catch (InterruptedException e) {
//			
//		}
		
		//방법2) 
		//sumThread스레드가 cpu점유를 받아 실행이 완료될 때까지 cpu점유를 받을 수 없는 상태를 만들어줌
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		} 
		
		System.out.println("1~100범위의 누적합: " + sumThread.getSum());
	}

}
