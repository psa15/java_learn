package sec05.exam02_array_bynew;

public class ArrayReferenceExample2 {

	public static void main(String[] args) {

		int[] scores = {83,90,87,90};
		int[] jumsu;

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//주소가 대입됨 {83,90,87,90} 데이터가 생성된 힙영역의 기억장소가 공유
		jumsu = scores;
		
		jumsu[0] = 0;
		jumsu[1] = 0;
		jumsu[2] = 0;
		jumsu[3] = 0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

}
