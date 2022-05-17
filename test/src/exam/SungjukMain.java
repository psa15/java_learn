package exam;

import java.util.Scanner;

public class SungjukMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//객체 생성
		Sungjuk scores = new Sungjuk();
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("점수 입력 : ");
		
//		String name1 = name; //필요 없는 코드
		scores.setName(name);
		
		int[] jumsu = new int[4];
		
		for(int i=0; i<4; i++) {
		jumsu[i] = sc.nextInt();
		}
		scores.setJumsu(jumsu);
		
		System.out.println("이름은? " + scores.getName());
		System.out.println("총점은? " + scores.getSum());
		System.out.println("평균은 " + scores.getAvg());
		

	}

}
