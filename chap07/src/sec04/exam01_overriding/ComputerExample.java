package sec04.exam01_overriding;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		//부모클래스 객체 생성
		Calculator calculator = new Calculator(); //직접 썼기 때문에 자식클래스와는 연관X
		System.out.println("원 면적: " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); //default 생성자를 썼음에도 에러가 안남 = Calculator 클래스에 자동으로 default 생성자 생성됨
		//areaCircle() 재정의 하면, Computer클래스에서 생성한 메서드가 호출
		//areaCircle() 재정의 X, Calculator클래스의 메서드가 호출
		System.out.println("원면적: " + computer.areaCircle(r));

	}

}
