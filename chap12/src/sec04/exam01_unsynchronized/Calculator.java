package sec04.exam01_unsynchronized;

//공유자원 용도로 사용할 클래스
public class Calculator {
	//user1, user2스레드 객체에서 공유로 참조
	
	//필드
	private int memory; //공유자원
	//메소드
	public int getMemory( ) {
		return memory;
	}
	//메소드
	public void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000); //2초간 일시정지. 스레드가 CPU 점유상태를 벗어남
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
}
