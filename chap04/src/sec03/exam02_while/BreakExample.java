package sec03.exam02_while;

public class BreakExample {

	public static void main(String[] args) {
		
		while(true) {
			int num = (int)(Math.random()*6) + 1; //1~6범위
			System.out.println(num);
			if (num == 6) {
				break; //while, for, do-while문을 빠져나옴
			}
		}
		
		System.out.println("종료");
	}
}
