package sec07.exam01_daemon;

public class DaemonExample {

	public static void main(String[] args) {

		AutoSaveThread autoSaveThread = new AutoSaveThread();
//		autoSaveThread.setDaemon(true); //데몬스레드(보조) , 주 스레드: main스레드
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000); //3초 일시정지 동안 AutoSaveThread의 while문이 돌아감(1초씩 쉬니까 최대 3번 돌거임)
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메인 스레드 종료"); //데몬스레드인 AutoSaveThread 스레드도 자동 종료
	}

}
