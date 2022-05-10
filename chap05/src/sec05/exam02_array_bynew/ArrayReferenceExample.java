package sec05.exam02_array_bynew;

public class ArrayReferenceExample {

	public static void main(String[] args) {

		int[] scores = {83,90,87,90};
		int[] jumsu;

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//주소가 대입됨 {83,90,87,90} 데이터가 생성된 힙영역의 기억장소가 공유
		jumsu = scores;
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(jumsu[i]);
		}
	}

}
