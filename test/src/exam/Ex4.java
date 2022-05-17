package exam;
class T1 {
	void t1() {
		System.out.println("T1 class's method");
	}
}
public class Ex4 extends T1 {

	void t1() {
		System.out.println("Ex4 class's t2 method");
	}
	public static void main(String[] args) {
		T1 t = new Ex4();
		t.t1();

	}

}
