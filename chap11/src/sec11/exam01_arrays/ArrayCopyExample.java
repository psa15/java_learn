package sec11.exam01_arrays;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {

		//Arrays 클래스: 배열 기능을 지원하는 목적
		//배열 복사
		char[] arr1 = {'J','A','V','A'};
		
		//1)
		char[] arr2 = Arrays.copyOf(arr1, arr1.length); //새로운 힙 영역에 새로운 기억장소가 생성되어 복사되어 들어가 있고 그 주소를 참조
		
//		char [] arr3  = arr1; // 주소를 대입한 것. 
		
		System.out.println(Arrays.toString(arr2));

		//2)
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//3)
		char[] arr4 = new char[arr1.length]; //= new char[4]
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(arr4);
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] : " + arr4[i]);
		}
	}

}
