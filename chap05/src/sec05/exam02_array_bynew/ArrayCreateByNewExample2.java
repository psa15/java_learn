package sec05.exam02_array_bynew;

public class ArrayCreateByNewExample2 {
	
	public static void main(String[] args) {
		//배열의 첨자가 변경될 때마다 모든 코드의 값을 바꾸기 힘듦
		int[] arr1 = new int[4]; 
//		[3] -> [4] 변경되면 아래 for 문의  조건도 바꿔야함 -> .length 배열의 길이(첨자크기) 사용
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
