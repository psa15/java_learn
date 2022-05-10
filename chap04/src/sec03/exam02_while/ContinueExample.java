package sec03.exam02_while;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			
			//i가 2의 배수가 아니면 = i가 홀수이면
			if(i%2 != 0) {
				continue; //밑의 sysout 실행 X i++실행
			}
			System.out.println(i); //i가 짝수면 출력
		}

	}

}
