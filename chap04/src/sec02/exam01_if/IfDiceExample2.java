package sec02.exam01_if;

public class IfDiceExample2 {
	
	public static void main(String[] args) {
		
		//랜덤기능
		/*
		 Math 클래스: 수학관련기능을 제공
		 사용법: Math. →하위명령어 나옴
		 */
		//Math.random() : 0.0 이상에서 1.0미만의 랜덤으로 실수값(double)을 반환
		//주사위? 1 ~ 6

//		System.out.println((int)(Math.random() * 6) + 1);
		
		int num = (int)(Math.random()* 6) + 1;
		
		if(num ==1) {
			System.out.println(num + "번이 나옴");
		} else if(num ==2) {
			System.out.println(num + "번이 나옴");
		} else if (num == 3) {
			System.out.println(num + "번이 나옴");
		} else if (num == 4) {
			System.out.println(num + "번이 나옴");
		} else if (num == 5) {
			System.out.println(num + "번이 나옴");
		} else {
			System.out.println(num + "번이 나옴");
		}
	}

}
