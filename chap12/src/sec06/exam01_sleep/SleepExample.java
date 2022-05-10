package sec06.exam01_sleep;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 10; i++) {
			toolkit.beep();//비프음 소리내는 기능
			try {//현재 스레드 자신의 CPU점유(실행) 상태를 3초간 벗어나자는 의미
				Thread.sleep(3000); //main스레드 3초 일시정지 timed_waiting 상태 -> 3초 경과 후 -> runable상태(cpu 점유)
				
			} catch (InterruptedException e) {
				
			} 
		}

	}

}
