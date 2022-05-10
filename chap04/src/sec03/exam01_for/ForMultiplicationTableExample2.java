package sec03.exam01_for;

public class ForMultiplicationTableExample2 {

	public static void main(String[] args) {
		// 구구단 만들기
		//i 곱, j 단
		// i = 2 j = 1,2,3,,,,,9
		
		for (int i = 1; i <=9; i++) {

			//1)
			for (int j = 2; j <=9; j++) {
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}
			//2) 두 번째 줄 작성 전에 다음줄로 내려가줘
			System.out.println();
		}

	}

}
