package sec05.exam02_array_bynew;

public class AdvancedForExample {

	public static void main(String[] args) {
		// 향상된 for문
		
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		/* 기본
		  for(int i = 0; i < scores.length; i++) { 
		  		sum += scores[i]; 
		  }
		 */
		
		/*
		 for (데이터타입 변수 : 배열) { // 데이터타입은 배열의 데이터타입과 일치
		 	sum += score;
		 */
		for (int score : scores) {
			sum += score;
		}
		System.out.println(sum);
	}

}
