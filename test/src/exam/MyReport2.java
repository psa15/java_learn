package exam;

public class MyReport2 {
	
	String name;
	String tel;
	String addr;
	public static void main(String[] args) {
	
		MyReport2 myReport = new MyReport2();
		myReport.name = "홍길동";
		myReport.tel = "010-5555-5555";
		myReport.addr = "서울시 노원구 상계동 1번지";
		
		System.out.printf("이름: %s. 전화번호: %s 주소: " + myReport.name, myReport.tel, myReport.addr);

	}

}
