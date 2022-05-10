package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1); //힙 영역에 생성된 values1변수가 가지고 있는 주소를 대입
		//result1 = return값 
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); //직접 생성해서 values(Computer.java의)에 대입
		System.out.println("restul2: " + result2);
		
		//sum2 (가변인수) 사용
		//파라미터에 0개 이상의 값을 제공하여 사용
		int result3 = myCom.sum2(1,2,3); //배열과 같은 성격인데 바로 데이터 값만 입력
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);
		
		//공통점
		myCom.sum1(null); //배열의 기본값 = null
		myCom.sum2(null); //null이 기본값인 걸로 보아 배열!
		
		//차이점
//		myCom.sum1(); //값을 안주면 에러, 파라미터 값 반드시 제공
		myCom.sum2(); //줄 게 없음 안줘도 됨, 파라미터 값 생략 가능
	}

}
