package sec01.exam01_basic;

public class ObjectDemo {

	public static void main(String[] args) {
		//Object클래스: 최상위 클래스, 모든 데이터를 저장 및 사용 가능
		
		Object o1 = "홍길동";
		Object o2 = 10;
		Object o3 = 3.14;
		//에러 X

		Object o4 = new Person();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		System.out.println(o4);
	}

}

class Person {
	
}
