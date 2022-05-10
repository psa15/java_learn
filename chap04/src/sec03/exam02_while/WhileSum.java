package sec03.exam02_while;

public class WhileSum {
	
	public static void main(String[] args) {
		//1~100범위의 합계를 누적
		
		int sum = 0; //누적의 합계를 저장
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~"+ (i-1) + " 합계는? " + sum); //i가 101일 때 바져나오므로
	}

}
