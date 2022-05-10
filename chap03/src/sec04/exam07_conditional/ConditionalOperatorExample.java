package sec04.exam07_conditional;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// 삼항 연산자
		
		 int score = 85;
		 //score변수의 값이 90보다 크면 A, 아니면 F
		 char grade = (score > 90) ? 'A' : 'F';
		 System.out.println(score + "점수는? " + grade + "등급입니다.");

	}

}
