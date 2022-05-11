package sec03.exam01_hashset;

public class Member {

	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/*
	 객체가 생성시 객체 비교에 사용하는 hashCode(), equals()메서드를 재정의하여 
	 힙영역의 내용에 해당하는 기억장소의 데이터가 동이랗면 도일한 객체로 처리가 되도록 재정의
	 */
	
	//아래 재정의한 메소드 두 개를 주석을 걸면 총 객체수가 2가 나옴
	//hashCode(), equals() 재정의 구문을 주석 유무에 따라 동일객체 여부가 달라짐
	//아래 재정의한 메소드가 주석시 Object클래스의 메소드가 동작
	@Override
	public int hashCode() {
		
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj; //멤버면 형변환
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
}
