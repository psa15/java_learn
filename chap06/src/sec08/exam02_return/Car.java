package sec08.exam02_return;

//차에 대한 정보, 기능을 정의한 클래스
public class Car {

	//필드: 가스 저장소
	int gas;
	
	//생성자: 생성자를 수동으로 정의하지 않으면 컴파일러에 의해 Car.class파일에 디폴트 생성자가 자동으로 추가
	
	//메소드: 가스 주입 기능
	//this: Car클래스 자신을 가리키는 상대적 의미
	void setGas(int gas) { //가스 주입하고 끝이어서 리턴값 X
		this.gas = gas; //좌측 gas는 필드, 우측 gas는 파라미터 (확인은 ctrl누르고 클릭하면 알려줌)
	}
	
	//메소드: 가스 보유상태 체크
	//return: 메서드 실행을 종료하는 기능
	//return 반환값: 메서드를 호출한 위치로 반환값을 보냄
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} //else를 써도 되긴 하지만 코드를 줄이기 위해 안씀
		
		System.out.println("gas가 있습니다.");
		return true;

	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달려~ gas잔량: " + gas);
				gas -= 1;
			} else {
				System.out.println("멈춤");
				return; //반환값 X, 그저 메소드 동작 종료 목적
			}
		}
	}
}
