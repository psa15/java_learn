package sec02.exam01_if;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		/*
		 점수가 90 이상이면, A
		 점수가 80 이상이면 B
		 점수가 70 이상이면 C
		 나머지는 D
		 */
		
		int score = 89;
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}

	}

}
