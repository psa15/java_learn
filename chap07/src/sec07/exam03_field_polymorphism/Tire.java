package sec07.exam03_field_polymorphism;

//tire 표준/규격에 해당하는 클래스
//문법보다는 설계가 중요(다형성 이해를 위해)
public class Tire {

	//필드
	public int maxRotation; //최대 회전수(수명)
	public int accumulatedRotation; //누적회전수
	public String location; //타이어 위치
	
	
	//Constructor
	public Tire(String location, int maxRotation) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	//method
	public boolean roll() { //바퀴 굴러가는거
		++accumulatedRotation;
		
		//타이어의 최대회전수가 누적회전수보다 작으면 양호
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + location + " Tire 펑크***");
			return false;
		}
		
	}
}
