package sec03.exam02_while;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		// 
		
		boolean run = true; //flag 용도 -어떤 행위를 할때 boolean 값을 이용하여 true 일 땐 프로그램이 동작되게 하고 false일 때는 프로그램이 동작되지 않게 제어
		int speed = 0; //속도
		int keyCode = 0; //1,2,3(약속된 값이 들어옴)
		
		while (run) {
			if ((keyCode !=13) && (keyCode !=10)) { //keyCode가 10번과 13번이 아니면 진행
				System.out.println("====================");
				System.out.println("1.증속  | 2.감속 | 3.중지");
				System.out.println("====================");
				System.out.print("선택: ");
				
			}
			//아래 구문이 실행되면 모든 작업이 일시정지가 되며 사용자가 키보드로 데이터를 입력해야 진행이 계속된다.
			keyCode = System.in.read(); //버퍼(임시기억장소)
			
			//키보드로 입력을 받은 숫자는 아스키코드로 저장되어 1 == 49(아스키코드의 숫자 1)
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도는? " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("현재 속도는? " + speed);
			} else if(keyCode == 51) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");

	}

}
