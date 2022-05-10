package sec07.exam06_casting;

public class ChildExample {
	
	public static void main(String[] args) {
		
		Parent parent= new Child();//다형성, upcasting
		
		//부모클래스의 변수에서는 자신의 멤버만 접근이 가능
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"; //X
		 * parent.method3(); //X
		 */
	
		/*
		 Parent parent= new Child(); 를
		Child child = new Child();
		Parent parent = child;
		 이렇게 코드를 쳤으면 바로
		 child.field2; 이렇게 가능하지만,,, 
		 아니니까
		 */
		//부모클래스 변수를 자식클래스로 명시적형변환 해서 사용 가능
		Child child = (Child) parent; //다운캐스팅(DownCasting)
		child.field2 = "yyy"; //가능
		child.method3(); //가능
	

	}
}
