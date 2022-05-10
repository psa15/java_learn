package sec05.exam01_annonymous_extends;

public class SubPerson extends Person{
	void work() {
		System.out.println("출근");
	}
	
	@Override
	void wake() {
		System.out.println("6 wake up");
		work();
	}
}
