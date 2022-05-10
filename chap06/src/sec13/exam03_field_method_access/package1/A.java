package sec13.exam03_field_method_access.package1;

public class A {

	//필드
	public int field1;
	int field2; //default
	private int field3;
	
	//생성자
	public A() {
		//같은 클래스에서는 접근자 영향 X
		field1 = 1;
		field2 = 2;
		field3 = 3;
		
		//main()메소드 안의 코드만 작성된 순서대로 실행, 클래스 안에서는 순서 중요 X
		//다만 보기 좋게 필드, 생성자, 메소드 순으로 적어주세요 일뿐
		method1();
		method2();
		method3();
	}
	
	//메소드
	public void method1() {}
	void method2() {} //default
	private void method3() {}
}
