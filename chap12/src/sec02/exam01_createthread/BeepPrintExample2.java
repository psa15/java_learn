package sec02.exam01_createthread;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//BeepTask.java 가져오기
		//방법1) 다형성(부모인터페이스변수로 자식구현객체를 대입받음)
		//main스레드와 관련 X 별도로, 독립적인 스레드로 존재
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); //thread 객체 생성
		
		thread.start(); //BeepTask클래스의 재정의된 run()메서드 호출
		//start()메소드가 호출되면 main스레드의 영향 X
//		thread.run(); 직접 호출 X
		
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
