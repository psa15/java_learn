package sec05.exam01_annonymous_extends;

public class Main {

	public static void main(String[] args) {
		SubPerson subPerson = new SubPerson();
		
		Anonymous anonymous = new Anonymous();
		
		anonymous.field.wake();
		
		anonymous.method1();
		
		anonymous.method2(
				new Person() {
					void study() {
						System.out.println("studying");
					}
					@Override
					void wake() {
						System.out.println("8 o'clock wake up");
					}
				}
		);
		
		

	}

}
