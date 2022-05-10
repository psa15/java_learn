package sec04.exam01_arithmetic;

public class OverflowExample {

	public static void main(String[] args) {
		/* overflow 발생되어 엉뚱한 값 출력
		int x = 1000000;
		int y = 1000000;
		int z = x * y; //z값이 int형의 범위를 벗어남
		System.out.println(z); //엥 개이상한 값 나옴 에러도 안나오고,,,-727379968 이런 값이...ㅋ
		*/
		
		long x = 1000000;
		long y = 1000000;
		long z = x * y;
		System.out.println(z);
	}

}
