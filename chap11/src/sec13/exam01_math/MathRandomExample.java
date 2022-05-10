package sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {

		//주사위 던지기
		//0.0 * 6 <= (Math.random()*6) < 1.0 * 6
		//int형 변환: 0 <= (Math.random()*6) < 6
		// + 1 : 1 <= (Math.random()*6) < 7
		int num = (int)(Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);

		//x의 값이 15 ~ 30범위의 값이 나오려면?
		System.out.println("15 ~ 30 범위의 임의의 값: " + getRndInteger(15,31));
	}

	public static int getRndInteger(int min, int max) {
		 return (int)(Math.random() * (max - min)) + min;
	}
}
