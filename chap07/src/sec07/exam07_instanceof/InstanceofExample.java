package sec07.exam07_instanceof;

public class InstanceofExample {

	//method
	public static void method1(Parent parent) {//매개변수의 다형성 - 자식객체를 사용하고자 하는 의도가 있음
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("Child 로 형변환 성공");
		} else {
			System.out.println("Child로 형변환되지 않음");
		}
	}
	public static void main(String[] args) {
		//형변환시 에러발생을 방지하기 위한 기능
		
		Parent parent = new Parent(); //parent instanceof child -> false
//		Parent parent = new Child(); //parent instanceof child -> true
		method1(parent); //static끼리는 직접 호출 가능
	}

}
