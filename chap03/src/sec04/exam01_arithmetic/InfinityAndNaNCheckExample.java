package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {
	
	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		System.out.println(z);
		
		double t = x % y;
		System.out.println(t);
		
		//변수의 값이 Infinity인지 NaN인지 확인하는 명령어
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
		}

}
