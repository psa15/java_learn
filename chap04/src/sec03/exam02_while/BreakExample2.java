package sec03.exam02_while;

public class BreakExample2 {

	public static void main(String[] args) {
		//label정의
		Outer: for(char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break; //안쪽 for문(lower)을 빠져나온다.
//					break Outer; //Outer레이블의 for문을 빠져나옴
				}
			}
		}
	
	System.out.println("종료");
	}
}
