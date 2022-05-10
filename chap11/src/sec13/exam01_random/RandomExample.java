package sec13.exam01_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		//Arrays 클래스: 배열기능을 지원하는 목적
		//1)배열복사
		//2)배열비교
		
		//선택번호 - 로또 번호 선택
		int[] selectNumber = new int[6];
		Random random = new Random(3); //생성자 3: seed값
		System.out.println("선택번호: ");
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("당첨번호: ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		//배열값 오름차순으로 정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		//두 배열의 값이 같은지를 비교
		//만약에 selectNumber와 winningNumber가 2차원 배열이었다면 deepequals() 사용
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부: ");
		if(result) {
			System.out.println("1등");
		} else {
			System.out.println("당첨 안됨");
		}
	}

}
