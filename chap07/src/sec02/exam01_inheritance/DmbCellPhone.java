package sec02.exam01_inheritance;

//하위 클래스 extends 상위클래스
//자식클래스 extends 부모클래스
public class DmbCellPhone extends CellPhone {
	//CellPhone 클래스에 있는 코드들을 마치 내가 작성한 것 처럼 사용이 가능해짐
	
	//필드
	int channel;
	
	//생성자
	//부모 클래스의 필드로도 생성자 선언 가능
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB방송수신을 멈춥니다.");
	}

}
