package sec07.exam02_default_extends;

public interface ChildInterface2 extends ParentInterface {

	//부모인터페이스의 디폴트메소드 재정의
	@Override
	default void method2() {
		
	}
	
	//자신의 추상메소드
	public void method3();
}
