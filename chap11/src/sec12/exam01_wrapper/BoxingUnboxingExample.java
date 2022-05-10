package sec12.exam01_wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		//참조타입 = 참조타입 이지만 Integer("200")은 "200"이 200으로 변환되고 다시 Integer형으로 변환되기 때문에 박싱
		Integer obj3 = Integer.valueOf("300");
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
				
	}

}
