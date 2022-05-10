package sec02.exam01_createthread;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		//방법2
		Thread thread = new BeepThread();
		
		thread.start();

		//main스레드의(main메서드)에 제어
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //0.5초간 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
