package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();
		
		/* 단순 결과호출은
		 impl.methodA();
		 impl.methodB();
		 impl.methodC();
		 */
		
		//다형성 공부를 위해
		//부모인터페이스 변수 = 자식구현객체;
		//부모 자신 인터페이스의 추상메소드명에 해당하는 메소드만 호출
		InterfaceA iA = impl;
		iA.methodA(); //자기 메소드만 나옴(methodB(), methodC() X)
		System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		System.out.println();
		
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();

	}

}
