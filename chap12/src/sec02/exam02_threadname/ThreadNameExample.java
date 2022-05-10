package sec02.exam02_threadname;

public class ThreadNameExample {

	public static void main(String[] args) {
		//Thread.currentThread(); 현재 실행되는 스레드 객체를 참조
		//1)main스레드
		Thread mainThread = Thread.currentThread(); 
		//mainThread변수는 현재 실행되는 스레드 객체인 main스레드 참조
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		//thread로 사용할 클래스를 객체 생성하는 방법
		//2)ThreadA스레드
		ThreadA threadA = new ThreadA(); //힙영역의 메모리 생성
		System.out.println("작업 스레드 이름: " + threadA.getName()); //작업 스레드: 새로 만든 스레드
		threadA.start(); //ThreadA클래스의 run()메서드 호출
		
		//3)ThreadB스레드
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start(); //ThreadB클래스의 run()메서드가 호출
		//더 자세하게는 start()메소드가 호출되면 CPU로부터 호출될 수 있는 자격이 주어짐
	}

}
