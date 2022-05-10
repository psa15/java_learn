package sec02.exam01_createthread;

import java.awt.Toolkit;
//방법2) Thread 클래스 상속
public class BeepThread extends Thread {

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
