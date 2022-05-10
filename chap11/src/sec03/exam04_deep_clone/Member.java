package sec03.exam04_deep_clone;

import java.util.Arrays;

//깊은 복사
//구성요소인 참조타입의 기억장소를 각각 생성한다.
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
	
	//object 클래스의 clone() 재정의 -> 깊은 복사 기능으로
	@Override
	protected Object clone() throws CloneNotSupportedException {

		Member cloned = (Member) super.clone(); //cloned에 object클래스의 clone()메소드 대입 ->얕은 복사
		/*
		밑의 두 줄의 코드 덕분에 깊은 복사
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		*/
		
		//새로운 배열생성하고 대입
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//cloned.scores까지는 이전 주소가 대입, Arrays.copyOf(this.scores, this.scores.length);로 새로운 배열 생성하고 대입
		
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}
	
	
	//복제 기능의 메서드
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone(); //Object가 아닌 Member의 재정의된 clone()
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
	}


}
