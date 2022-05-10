package sec05.exam01_state;

//스레드 클래스
public class TargetThread extends Thread {

	//스레드가 객체생성(NEW 상태)되어 start()메소드 호출 후에 스레드가 runable상태에서 cpu점유시 호출되는 메소드 => run()메소드
	
	@Override
	public void run() {
		//스레드의 상태변화를 발생시키기 위해서
		//스레드가 순환방식에 의하여 cpu점유가 변경되는 상황을 연출하기 위해 for문 작성함
		for(long i = 0; i < 10000000; i++) {}
		
		try {
			Thread.sleep(1500); //1.5초간 일시정지가 되면 타겟 스레드상태: TIMED_WAITING
			//1.5초 후에는 RUNABLE상태 복귀
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //1.5초간 일시정지
		
		//스레드의 상태변화를 발생시키기 위해서
		for(long i = 0; i < 1000000000; i++) {}
	}
}
