package sec05.exam02_array_bynew;

public class ArrayCreateByNewExample {
	
	public static void main(String[] args) {
		//베열선언
		
		int[] arr1 = new int[3]; 
		//int형(4byte) * 3 = 12byte의 연속적인 기억장소가 힙 영역에 기본값으로 생성
		//기본값 
		//[3] : 3 -> 첨자 : 배열의 기억장소의 크기
		System.out.println(arr1[0]);
		
		boolean[] bArr = new boolean[3];
		System.out.println(bArr[0]);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		
		//배열에 값 지정
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//확인작업
		for (int i = 0; i < 3; i++) {
			System.out.println(arr1[i]);
		}
		
		double[] dArr = new double[3]; //24byte
		for (int i = 0; i < 3; i++) {
			System.out.println(dArr[i]);
		}
		
		// 참조타입으로 만든 배열
		String[] arr3 = new String[3]; //String arr3-1. String arr3-2, String arr3-3
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
		
		arr3[0] = "1월"; //String arr1 -> 데이터가 아니라 주소가 들어있다,,,
		arr3[1] = "2월"; //String arr2
		arr3[2] = "3월"; //String arr3
		
		for (int i = 0; i < 3; i++) {
			System.out.println(arr3[i]);
		}
	}

}
