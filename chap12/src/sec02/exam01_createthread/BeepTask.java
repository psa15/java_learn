package sec02.exam01_createthread;

import java.awt.Toolkit;

//1)Runnable인터페이스 구현
//BeepPrintExample1클래스의 main스레드에서 관리되는 main메서드의 일부 코드를 새로운 스레드 환경으로 분리하는 작업
public class BeepTask implements Runnable {

	//BeepPrintExample2의 thread 스레드 객체 제어
	@Override
	public void run() {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); //"비프음"소리 메소드
			try {//시각적 효과 + 정확한 효과를 보기 위해
				Thread.sleep(500); //0.5초간 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
