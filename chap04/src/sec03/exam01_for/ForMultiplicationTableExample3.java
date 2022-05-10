package sec03.exam01_for;

public class ForMultiplicationTableExample3 {

	public static void main(String[] args) {
		// 구구단 만들기
		//i 곱, j 단
		// i = 2 j = 1,2,3,,,,,9
		//제목행 달기 continue or break or if 등등
		
		for (int i = 1; i <=10; i++) {
			
			//1)
			for (int j = 2; j <=9; j++) {
				if (i == 1) {
					System.out.print((j) + "단\t");
					continue;
				}
				System.out.print(j + "*" + (i-1) + "=" + (j*(i-1)) + "\t");

	
			}
			//2) 두 번째 줄 작성 전에 다음줄로 내려가줘
			System.out.println();
		}
	}

}
