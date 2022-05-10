package sec03.exam04_clone;

//객체 복사를 하기 위해 반드시 Cloneable 인터페이스를 구현해야 함
//Cloneable인터페이스: 추상메서드 존재 X
//Member m1 = new Member();
public class Member /*extends Object*/ implements Cloneable {

	//field: 참조타입
	public String id;
	public String name;
	public String password;
	//필드: 기본타입
	public int age;
	public boolean adult;
	
	//생성자
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//복제 기능의 메서드
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone(); //얕은 복사: 구성요소인 참조타입은 새로운 메모리가 생성이 되지않고 공유
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
	}
}
