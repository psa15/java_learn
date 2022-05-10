package sec06.exam01_interface_extends;

//InterfaceA, InterfaceB 상속받음
public interface InterfaceC extends InterfaceA, InterfaceB{
//InterfaceA, InterfaceB가 클래스였다면 재정의가 필수!
	//인터페이스는 추상메소드의 바디부분이 있으면 안됨!
	
	void methodC();

}
