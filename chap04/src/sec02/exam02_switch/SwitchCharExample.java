package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		//대소문자 구분 없이 출력 
		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
		
		}

	}

}
