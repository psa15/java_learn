package sec03.exam01_for;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		
		//1 ~100 범위의 값을 합계를 구하라
		
//		int sum = 0;
//		
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		
//		System.out.println("1 ~ 100까지의 합은? " +sum);
		
		/*
		 1 ~ 100의 누적합은?
		 */
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println("1 ~ " + (i-1) + " 누적합은? " + sum);

	}

}
