package sec03.exam01_priority;

public class PriorityExample {
	
	//스레드는 순환할당 방식과 우선순위방식으로 스레드 스케줄링이 진행
	//순활할당방식은 코어가 각 스레드에 일정시간이 할당되어 동작되는 방식
	//우선순위방식은 1 ~ 10범위로 설정하며 기본값은 5
	//위의 2가지가 병행하여 스레드가 CPU의 점유를 받아 실행(동작)
	public static void main(String[] args) {
		
		//작업자 스레드 객체를 10번 생성 -> 실행 대기상태 스레드가 10개 존재

		
		for(int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i); //thread1~9우선순위: 1, thread10 우선순위: 10
			//우선순위 설정
			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY); //1 숫자로 적어도 되지만 코드를 더 잘 이해하기 위해 상수로
			} else {
				thread.setPriority(Thread.MAX_PRIORITY); //10
			}
			
			
			thread.start();
		}

	}

}
