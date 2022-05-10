package sec12.exam01_wrapper;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		// 자동 Boxing : 값 타입을 힙영역의 기억장소에 맞게 변환하는 과정
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입 시 자동 Unboxing : Boxing된 데이터를 기본타입형으로 변환하는 과정
		int value = obj; // obj 데이터타입의 크기(Integer)가 int형보다 크다 / int value = (int) obj; (int)가 생략됨
		System.out.println("value: " + value);
		
		//연산시 자동Unboxing
		int result = obj +100; 
		System.out.println(result);

		
		Object o = 100; //Boxing이 일어남
		
		int temp = (int) o; //unboxing -> 이래서 성능이 안좋음(자동 unboxing X)
		//위에는 컴파일 과정에서 unboxing 처리가 됨 -> Integer클래스 자체가 boxing을 위해 만들어짐
	}

}
