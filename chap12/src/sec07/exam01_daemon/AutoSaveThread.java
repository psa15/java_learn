package sec07.exam01_daemon;

public class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("작업내용을 저장함");
	}
	
	@Override
	public void run() {
		//데몬스레드로 동작목적이라면, 아래 내용은 기능의 보조역할을 하는 작업
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			save();
		}
	}

}
