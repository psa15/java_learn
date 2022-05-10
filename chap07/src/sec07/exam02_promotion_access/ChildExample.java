package sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		// new가 Child 클래스 갔다가 Parent클래스 가서 Parent거 힙영역에 메모리 생성, Child 생성, child 생성
		// -> child 클래스 parent 클래스 생성자 호출, child 생성자 호출
		Child child = new Child();
		
		Parent parent = child; // 묵시적 형변환
		
		//부모객체로 메소드 호출
		parent.method1();
		
		//Child 클래스의 재정의된 method2() 가 호출
		parent.method2(); 
		
		//호출 불가능
//		parent.method3();
		//method3() 호출하고 싶다면?
		child.method3();
	}
}
