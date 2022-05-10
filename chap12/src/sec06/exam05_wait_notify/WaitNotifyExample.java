package sec06.exam05_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {

		//1.공유객체 생성
		DataBox dataBox = new DataBox();
		
		//2. 생산자 소비자 스레드 객체 생성(1번 공유객체 생성해야 (dataBox)파라미터값으로 사용)
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		//3. 각각 실행
		producerThread.start();
		consumerThread.start();

	}

}
