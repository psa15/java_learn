package test;

import java.util.Arrays;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {10, 6, 25, 7, 4};
		
		for(int i = 0; i <arr.length; ++i) {
			for(int j=i+1; j<arr.length;++j) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
