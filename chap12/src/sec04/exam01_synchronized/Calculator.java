package sec04.exam01_synchronized;

//공유자원 용도로 사용할 클래스
public class Calculator {
	//user1, user2스레드 객체에서 공유로 참조
	
	//필드
	private int memory; //공유자원
	//메소드
	public int getMemory( ) {
		return memory;
	}
	//1) 동기화 메소드: 스레드가 CPU점유를 얻어 메소드의 작업이 완료될때까지 다른 스레드는 대기상태(block상태)
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //2초간 일시정지. 스레드가 CPU 점유상태를 벗어남
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	//2) 동기화 블록
	public void setMemory2(int memory) {
		synchronized (this) { //인스턴스일 경우 synchronized(this) 사용
			this.memory = memory;
			
			try {
				Thread.sleep(2000); //2초간 일시정지. 스레드가 CPU 점유상태를 벗어남
			} catch (InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
		
	}
}
