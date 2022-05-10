package sec04.exam07_conditional;

//public 키워드를 가지고 있는 클래스명은 파일명과 동일해야 함
public class ConditionalOperatorExample2 {

	public static void main(String[] args) {
		// 삼항 연산자
		
		 int score = 85;
		 //score변수의 값이 90보다 크면 A, 80보다 크면 B, 나머지는 C
		 char grade = (score > 90) ? 'A' : (score > 80 ? 'B' : 'C');
		 System.out.println(score + "점수는? " + grade + "등급입니다.");

	}

}
