package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
/*
 * 부모클래스 내용 힙영역에 메모리 생성
 * 부모클래스의 디폴트 생성자 호출
 * 자식클래스 내용 힙영역에 메모리 생성
 * 자식클래스의 매개변수 생성자 호출
 * 힙영역의 생성된 메모리 주소를 dmbCellPhone에 대입
 */
		DmbCellPhone dmbCellPhone = new DmbCellPhone("안드로이드", "검정", 10);
		//DmbCellPhone 클래스가 아니라 부모 클래스인 CellPhone에 가서 힙영역에 메모리를 생성하고 그 다음에 DmbCellPhone 에서 메모리 생성 

		//CellPhone 클래스(부모)로 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model); //model이 default여서 같은 패키지라 public의미
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone 클래스(자식)의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone 클래스(부모)로 상속받은 메소드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕사헤요");
		dmbCellPhone.sendVoice("반갑습니다");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone 클래스(자식)의 method
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(6);
		dmbCellPhone.turnOffDmb();
	}

}
