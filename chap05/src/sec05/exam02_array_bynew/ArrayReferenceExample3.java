package sec05.exam02_array_bynew;

public class ArrayReferenceExample3 {

	public static void main(String[] args) {

		int[] scores = {83,90,87,90}; //힙 영역 메모리 생성
		int[] jumsu = new int[4]; //힙 영역에 ㅔ모리 생성

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);
		}

		jumsu = scores; //scores배열객체가 가지고 있는 주소가 대입
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(jumsu[i]);
		}
	}

}
