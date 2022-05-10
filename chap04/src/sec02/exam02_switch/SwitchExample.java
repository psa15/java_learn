package sec02.exam02_switch;

public class SwitchExample {

	public static void main(String[] args) { 
		
		int num = (int)(Math.random()*6) + 1; //1,2,3,4,5,6
		
		switch (num) {
		case 1:
			System.out.println("1번 출력");
			break;
		case 2:
			System.out.println("2번 출력");
			break;
		case 3:
			System.out.println("3번 출력");
			break;
		case 4:
			System.out.println("4번 출력");
			break;
		case 5:
			System.out.println("5번 출력");
			break;
		case 6:
			System.out.println("6번 출력");
			break;
		}
		

	}

}
