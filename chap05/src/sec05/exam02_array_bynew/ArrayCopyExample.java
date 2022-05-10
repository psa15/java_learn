package sec05.exam02_array_bynew;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열복사기능
		
		int[] oldIntArr = {1,2,3}; //12byte 기억장소가 힙영역에 생성
		int[] newIntArr = new int[5]; //int형 기본값 0을 가진 20byte 기억장소 힙영역에 생성
		
		for (int i = 0; i < oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		
		for (int i = 0; i < newIntArr.length; i++) {
			System.out.println(newIntArr[i]);
		}

	}

}
