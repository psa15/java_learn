package sec06.exam05_wait_notify;

public class ConsumerThread  extends Thread {
	
	private DataBox dataBox;
	
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = dataBox.getData(); //소비자가 제품을 구매
			
		}
	}
}
