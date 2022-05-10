package sec03.exam02_localclass_access;

//로컬클래스에서의 사용제한
public class Outer {

	//java 7 이전에는 에러가 남
	//로컬클래스에서 메소드의 매개변수, 지역변수를 접근하고자 할 경우에는 final 키워드로 선언
	//(int arg 앞에 final 붙여야 했음)
	public void method1(final int arg) {
		
		final int localVariable = 1;
		
		//로컬클래스
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		
		int localVariable = 1;
		//아래 로컬클래스 때문에 매개변수, 지역변수가 final의미로 해석되어 값 변경 X
//		arg = 100;
//		localVariable = 5;
		
		//로컬클래스에서 메소드의 매개변수, 지역변수를 사용시 final 키워드가 적용된 의미로 사용
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
