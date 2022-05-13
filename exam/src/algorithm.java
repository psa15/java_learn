import java.util.Arrays;

public class algorithm {

	public static void main(String[] args) {
		// 알고리즘 : 문제해결능력
		
		//선택 정렬 알고리즘 이용 (오름차순 정렬)
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

		//이게 맞는데
		for(int i=0; i<arr.length-1; i++) { //마지막에서 두번째까지만 비교하면 됨
			for(int j = i+1; j<arr.length; j++) {//5부터 비교가 들어감
				if(arr[i] > arr[j]) {//내림차순: if(arr[i] < arr[j])
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(arr[i] +" "+ arr[j] + "바꿈: " + Arrays.toString(arr));
				}
//				else {
//					System.out.println(Arrays.toString(arr));
//				}
			}
		}
		//이건 7이랑 5만 바뀜
//		for(int i=0; i<arr.length; i++) {
//			for(int j=1; 1<=j; j--) {
//				if(arr[j] < arr[j-1]) {
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		
		System.out.println("마지막: " + Arrays.toString(arr));

	}

}
