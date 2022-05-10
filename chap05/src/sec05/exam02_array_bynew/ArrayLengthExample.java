package sec05.exam02_array_bynew;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// int[] scores = new int[3];
		// scores[0] = 83;
		// scores[1] = 84; 를 줄임
		int[] scores = {83,90,87};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("sum= " + sum);
		
		double avg = (double)sum / scores.length; //sum과 scores.length 둘 다 int 형임
		System.out.println("평균: " + avg);

	}

}
