package sec10.exam04_Singleton;

//클래스 패턴 디자인 중 하나의 패턴
//싱글톤: 클래스를 통하여 한개의 객체생성을 목적으로 한다
public class Singleton {
	
	//내부에 자기 안에 자기 객체 생성
	//JVM에서 메서드영역에 기억장소를 단 한번만 생성
	private static Singleton singleton = new Singleton();
	//이미 메서드 영역에 생성됨
	
	private Singleton() {} //생성자 -> private이라서 다른 클래스에서 new로 객체 생성 X
	
	//객체를 외부에서 접근하고자 메서드 작성
	static Singleton getInstance() {
		return singleton;
	}
}
