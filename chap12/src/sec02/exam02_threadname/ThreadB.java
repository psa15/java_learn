package sec02.exam02_threadname;

//thread로 사용할 ThreadB
public class ThreadB extends Thread {

	//thread 기본이름 사용(스레드 이름 정의 X 시)
	
	@Override
	public void run() {
		//코드작성: 이 코드를 독립적인 스레드로 제어
		//독립적인 스레드로 코드를 실행하고자 하는 의미
		//main스레드의 실행 영향에 받지 않고자 할 때
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용"); //getName(): 스레드 이름 출력
		}
	}
}
