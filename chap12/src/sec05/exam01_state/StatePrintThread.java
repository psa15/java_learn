package sec05.exam01_state;

public class StatePrintThread extends Thread {

	//필드
	private Thread targetThread; //TargetThread 객체생성되어 들어옴??
	
	//메소드: 필드를 사용하기 위한 목적, 기능, 행위 표현
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			if(state == Thread.State.NEW) {
				targetThread.start();
			} 
			if( state == Thread.State.TERMINATED) {
				//이 if문이 출력됐다는 것은 run()메소드가 실행이 완료됐다는 의미
				break;
			}
			try {
				Thread.sleep(500); //0.5초 일시정지
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
	}
}
