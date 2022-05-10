package sec06.exam05_wait_notify;

public class ProducerThread  extends Thread {
	
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = "Data-" + i; //제품
			dataBox.setData(data); //제품 진열대에 배치
		}
	}
}
