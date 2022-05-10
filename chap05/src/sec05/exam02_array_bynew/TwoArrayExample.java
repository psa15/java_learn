package sec05.exam02_array_bynew;

public class TwoArrayExample {

	public static void main(String[] args) {
		// 2차원 배열
		
		int[][] scores = new int[2][3]; //int 6개의 기억장소 힙영역에 생성
		
		//실제 기억장소의 인덱스명 : 행의 가수 -1, 열의 개수 -1
		//scores[0] : 첫번째 행
		scores[0][0] = 10;
		scores[0][1] = 20;
		scores[0][2] = 30;
		
		//scores[1] : 두 번째 행
		scores[1][0] = 40;
		scores[1][1] = 50;
		scores[1][2] = 60;
		
		//중첩 for문
		//scores.length: 행의 크기 (2)
		//scores[0].length : 첫번째 행의 열크기 (3)
		for (int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
