package sec04.exam01_unsynchronized;

//스레드로 사용할 User2클래스
public class User2 extends Thread{
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}

}
