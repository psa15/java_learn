package sec03.exam04_shallow_clone;

//얕은 복사
//구성요소인 참조타입의 기억장소는 공유된다.
public class Member /*extends Object*/ implements Cloneable {

	//field: 참조타입
	public String name;
	public int age;
	//깊은 복사의 실질적인 대상 필드
	public int[] scores; //new int[] {90, 90}주소  저장
	public Car car; //new Car("소나타") 주소 저장
	
	//생성자 - 툴사용
	public Member(String name, int age, int[] scores, Car car) {
		//super(); 컴파일 과정에서 .class파일에 자동 생성
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
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
