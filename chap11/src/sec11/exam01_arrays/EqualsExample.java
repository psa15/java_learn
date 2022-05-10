package sec11.exam01_arrays;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		//2차원 배열
		int[][] original = {{1,2},{3,4}}; //2*2행열 구성
		
		System.out.println("얕은 복사 후 비교");
		
		//힙영역에 배열구조의 메모리를 생성하여 데이터를 구성
		int[][] cloned1 = Arrays.copyOf(original, original.length); //original.equals(cloned1): false
		
		//주소가 대입되어 기억장소 공유
//		int[][] cloned1 = original; //original.equals(cloned1): true -> 기억장소 주소 공유
		
		//Object의 equals() : 주소비교
		System.out.println("배열 번지 비교: " + original.equals(cloned1));  
		
		//Arrays클래스의 비교메서드 사용
		//equals(): original[0]과 cloned1[0] 해당 행을 가리키는 주소
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1)); //true
		
		//deepEquals(): 데이터 비교: original[0][0] 과 cloned1[0][0] 값 비교
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1)); //true
		
		//깊은 복사의 참조타입을 각각 기억장소를 생성한 의미
		System.out.println("깊은 복사 후 비교");
		int[][] cloned2 = Arrays.copyOf(original, original.length); //얕은 복사
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);

		System.out.println("배열 번지 비교: " + original.equals(cloned2)); //false
		
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2)); //flase
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2)); //true
		
	}

}
