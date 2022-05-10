package sec07.exam02_default_extends;

public interface ChildInterface3 extends ParentInterface{

	//부모인터페이스의 디폴트메소드를 추상메소드로 재선언
	@Override
	public void method2();
	
	//자신의 추상메소드
	public void method3();
}
