package sec05.exam02_array_bynew;

public class ThreeArrayExample {

	public static void main(String[] args) {
		// 3차원 배열
		
		int[][][] scores = new int[2][3][4];//int 2*3*4의 기어장소 힙영역에 생성 
		
		System.out.println(scores.length); //면의 크기 2
		System.out.println(scores[0].length);// 첫번째 면의 행크기 3
		System.out.println(scores[1].length); //두번째 면의 행크기 3
		
		System.out.println(scores[0][0].length); //1면의 1행의 열크기 4
		System.out.println(scores[0][1].length); //1면의 2행의 열크기 4
		System.out.println(scores[0][2].length); //1면의 3행의 열크기 4
		
		//실제 데이터 저장된 기억장소 이름
		System.out.println(scores[0][0][0]); //첫번째 데이터가 저장되는 기억장소 이름
		System.out.println(scores[1][2][3]); //마지막 데이터가 저장되는 기억장소 이름
		
		//1면 1행에 0,1,2,3 값 주기!
//		for (int a = 0; a < scores[0][0].length; a++) {
//			scores[0][0][a] = a;
//		}
		//값 부여...
		int count = 1;
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				for (int k = 0; k < scores[i][j].length; k++) {
					scores[i][j][k] = count++;
				}
			}
		}
		//3차원구조의 데이터를 for문으로 출력
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				for (int k = 0; k < scores[i][j].length; k++) {
					System.out.print(scores[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
