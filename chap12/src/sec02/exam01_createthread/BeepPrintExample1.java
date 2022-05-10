package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	/*
	 스레드 정의: 메서드를 독립적으로 관리, 실행을 가능하게 하는 기능
	 
	 하나의 실행중인 프로그램: 프로세스(Process)
	 프로세스 안에는 기본스레드(이름: main 스레드)가 한 개 제공되고 있다
	 -> 1프로세스 1스레드
	 
	 main스레드: main()메소드를 구성요소로 관리
	 
	 */
	public static void main(String[] args) {
		/*
		 소리 출력 -> 문자열 출력 
		 */
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		//1번 for문 실행 후 2번 for문 실행 -> 비프음 먼저 출력된 후 띵 문자 출력
		//1)
		for(int i = 0; i < 5; i++) {
			toolkit.beep(); //"비프음"소리 메소드
			try {//시각적 효과 + 정확한 효과를 보기 위해
				Thread.sleep(500); //0.5초간 일시 정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//2)
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
