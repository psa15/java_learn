package sec03.exam01_equals;

//클래스는 참조타입 -> 데이터 타입 -> 데이터를 저장하는 기억장소 생성
//데이터는 비교가능
public class Member/*extends Object*/ {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	//데이터 비교 / 객체 비교
	//예상구문: m1.equals(m2)를 쓰려고 재정의함
	//Member클래스의 객체가 가리키는 id라는 기억장소에 문자열데이터가 같으면 true, 아니면 false로 재정의
	@Override
	public boolean equals(Object obj) { //모든 데이터 타입을 관리하는 최상위 클래스, 부모 클래스로서 어떤 클래스를 사용하든 감당 가능
		//Member클래스가 비교하고자 하는 것 재정의
		if (obj instanceof Member) {
			//나중에 값을 비교할 때 obj와 관련 있는지
			//혹시 m2(들어오는 파라미터가)가 Member클래스(같은 클래스)가 맞는지 확인작업!
			Member member = (Member) obj;
			if (id.equals(member.id)) { //그저 id라는 변수의 값이 같냐? 같으면 true 하자
				return true;
			}
		}
		return false;
	}
}
