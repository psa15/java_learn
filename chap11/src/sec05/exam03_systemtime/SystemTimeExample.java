package sec05.exam03_systemtime;

public class SystemTimeExample {

	public static void main(String[] args) {

		/*
		 시간기준: 1970년 1월 1일 0시 0분 0초 시작
		 */
		//코드 실행시간 체크 위해 
		//현재 상태 시간을 알기위해
		//nanosecond : 1/1000000000초
		Long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum +=i;
		}
		
		//끝난 시간 알기 위해
		Long time2 = System.nanoTime();
		
		System.out.println("1 ~ 1000000까지의 합: " + sum);
		System.out.println("계산에 걸린 시간: " + (time2 - time1) + " 나노초가 소요됨");

	}

}
