package sec05.exam02_array_bynew;

public class TwoJaggedArrayExample {

	public static void main(String[] args) {
		// 가변배열(톱니모양)
		
		//행마다 열크기를 생략
		int[][] scores = new int[2][];
		
		scores[0] = new int[2]; //첫 번째 행의 열의 크기를 2로 할래
		scores[1] = new int[3]; //두 번째 행의 열의크기를 3으로 할래
		
		scores[0][0] = 10;
		scores[0][1] = 20;
		
		scores[1][0] = 30;
		scores[1][1] = 40;
		scores[1][2] = 50;
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
