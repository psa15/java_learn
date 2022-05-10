package sec02.exam01_if;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		//score변수의 값이 90이상일 경우
		if(score >= 90) {
			System.out.println("점수가 90보다 크다");
			System.out.println("등급은 A입니다.");
		}
		
		//score 변수의 값이 90 미만일 경우
		if(score < 90) {
			System.out.println("점수가 90보다 작다");
			System.out.println("등급은 B입니다");
		}

	}

}
