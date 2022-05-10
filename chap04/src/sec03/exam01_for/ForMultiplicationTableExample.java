package sec03.exam01_for;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 구구단 만들기
		
		int i;
		int j;
		
		for (i = 1; i < 10; i++) {
			System.out.println(i + "단");
			for (j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}

	}

}
