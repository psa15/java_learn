package sec04.exam03_compare;

public class CompareOperatorExample1 {
	
	public static void main(String[] args) {
		//비교연산자 >,<, >=, <=, ==, !=
		//결과값: boolean(true, false)
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		//비교가 같거나 작은 것이 존재하면 true가 됨
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4: " + result4);
		
	}

}
