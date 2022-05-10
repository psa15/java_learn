package sec08.exam01_method_declaration2;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();

		int[] values1 = {1,2,3};
		myCom.sum1(values1); // 얘가 없으면 그냥 1,2,3 출력
		
		for(int i = 0; i < values1.length; i++) {
			System.out.println(values1[i]);
		}
		
	}

}
