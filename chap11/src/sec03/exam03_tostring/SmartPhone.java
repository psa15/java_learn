package sec03.exam03_tostring;

public class SmartPhone {
	
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//재정의 목적: 일반적으로 클래스의 멤버필드에 저장되어 있는 정보를 반환목적으로 한다.
	//Object클래스의 toString()메서드를 사용 X
	@Override
	public String toString() {
		
		return company + ", " + os; //변수에 저장되어있는 데이터 출력
	}
}
