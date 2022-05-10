package sec02.exam02_switch;

public class SwitchNotBreakCaseExample {

	public static void main(String[] args) {
		// 랜덤을 이용하여, 특정범위의 값을 얻어오기
		//Math.random()*4 : 0.0 <= random < 4
		int time = (int)(Math.random()*4) + 8; // 8 <= random <12
		
		//8시 출근, 9시 회의, 10시 업무, 그 이후 외근
		switch(time) {
			case 8:
				System.out.println("출근");
			case 9:
				System.out.println("회의");
			case 10:
				System.out.println("업무");
			default:
				System.out.println("외근");
		}

	}

}
